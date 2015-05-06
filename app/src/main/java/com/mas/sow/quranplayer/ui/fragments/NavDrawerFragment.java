package com.mas.sow.quranplayer.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mas.sow.quranplayer.R;
import com.mas.sow.quranplayer.ui.adapter.DrawerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NavDrawerFragment extends BaseFragment {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private View mDrawerView;
    private boolean mDrawerUserLearned;
    private RecyclerView mRecyclerView;
    private DrawerAdapter mDrawerAdapter;

    public NavDrawerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_nav_drawer, container, false);
        mRecyclerView = (RecyclerView) layout.findViewById(R.id.recyclerview_drawer);
        mRecyclerView.setLayoutManager( new LinearLayoutManager(getActivity()));
        mDrawerAdapter = new DrawerAdapter( getActivity() );
        mRecyclerView.setAdapter(mDrawerAdapter);
        return layout;
    }

    public void setupDrawer(DrawerLayout drawerLayout, Toolbar toolbar, int fragmentId){
        mDrawerLayout = drawerLayout;
        mDrawerToggle = new ActionBarDrawerToggle( getActivity(), mDrawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close){

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
            }
        };
        mDrawerLayout.setDrawerListener( mDrawerToggle );

        // first time  open drawer
        /*
        if( !mDrawerUserLearned ) {
            mDrawerView = getActivity().findViewById(fragmentId);
            mDrawerLayout.openDrawer(mDrawerView);
        }
        */

        mDrawerLayout.post( new Runnable() {
            @Override
            public void run() {
                mDrawerToggle.syncState(); // show Hamburger icon
            }
        });
    }

}
