package com.easylife.recyclerviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    List<Integer> avatars;
    List<String> names;
    List<String> describes;

    public MyAdapter(List<Integer> avatars, List<String> names, List<String> describes) {
        this.avatars = avatars;
        this.names = names;
        this.describes = describes;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.avatar.setImageResource(avatars.get(position));
        holder.name.setText(names.get(position));
        holder.describe.setText(describes.get(position));
    }

    @Override
    public int getItemCount() {
        return avatars.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView avatar;
        private TextView name;
        private TextView describe;

        public ViewHolder(View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            name = itemView.findViewById(R.id.name);
            describe = itemView.findViewById(R.id.describe);
        }
    }
}
