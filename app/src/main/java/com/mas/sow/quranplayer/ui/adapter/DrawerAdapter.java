package com.mas.sow.quranplayer.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mas.sow.quranplayer.R;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by sow.m on 2015/04/08.
 */
public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.DrawerHolder> {
    private Context mContext;

    public DrawerAdapter(Context context){
        mContext = context;
    }

    @Override
    public DrawerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from( parent.getContext())
                .inflate(R.layout.drawer_row, parent, false);
        DrawerHolder holder = new DrawerHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(DrawerHolder holder, int position) {
        holder.mDrawerIcon.setImageResource(R.drawable.ic_home);
        holder.mDrawerText.setText("Line " + position);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class DrawerHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @InjectView(R.id.drawer_icon) ImageView mDrawerIcon;
        @InjectView(R.id.drawer_text) TextView mDrawerText;

        public DrawerHolder(View itemView) {
            super(itemView);
            ButterKnife.inject(this, itemView);
            itemView.setOnClickListener( this );
        }

        @Override
        public void onClick(View view) {

        }
    }
}
