package com.example.application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>
{
    private List<Group> groups;
    private Context context;

    public RecyclerViewAdapter(List<Group> groups, Context context) {
        this.groups = groups;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        String value = "", value2 = "";
        final Group group = groups.get(position);
        for(int j = 0; j < group.staffModelList.size(); j++)
        {
            value += group.staffModelList.get(j).getNameStaff() + ", ";
        }
        for(int k = 0; k < group.roleModelList.size(); k++)
        {
            value2 = group.roleModelList.get(k).getNameRole();
        }
        holder.tv_content.setText(value);
        holder.tv_title.setText(value2);
    }

    @Override
    public int getItemCount() {
        return groups.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_content;
        TextView tv_title;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            tv_content = itemView.findViewById(R.id.tv_content);
            tv_title = itemView.findViewById(R.id.tv_title);
        }
    }
}
