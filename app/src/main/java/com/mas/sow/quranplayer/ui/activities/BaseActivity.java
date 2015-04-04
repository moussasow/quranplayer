package com.mas.sow.quranplayer.ui.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.mas.sow.quranplayer.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by Sow on 2015/03/08.
 */
public class BaseActivity extends ActionBarActivity {

    @InjectView(R.id.toolbar_main) Toolbar mToolbar;
    @InjectView(R.id.navigation_drawer) DrawerLayout mDrawerLayout;
    @InjectView(R.id.view_pager) ViewPager mViewPager;

    protected void InjectButterKnife(){
        ButterKnife.inject(this);
    }

    protected void setToolBar(){
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    protected void setNavigationDrawer(){
        final ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout,mToolbar, R.string.app_name, R.string.app_name);
        mDrawerLayout.setDrawerListener(toggle);
        mDrawerLayout.post( new Runnable() {
            @Override
            public void run() {
                toggle.syncState();
            }
        });
    }

    protected void setViewPager(){

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
