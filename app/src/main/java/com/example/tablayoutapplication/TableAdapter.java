package com.example.tablayoutapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TableAdapter extends RecyclerView.Adapter<TableAdapter.TableViewHolder> {
    ArrayList<String> Lesson;
    int page;

    public TableAdapter(ArrayList<String> Lesson, int page){
        this.Lesson = Lesson;
        this.page = page;
    }

    @NonNull
    @Override
    public TableViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.table, parent, false);
        return new TableViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TableViewHolder holder, int position) {
        holder.textTime.setText(MainActivity.Lesson.get(position));
        holder.textTimetwo.setText("Время");

    }

    @Override
    public int getItemCount() {
        return MainActivity.Lesson.size();
    }

    public class TableViewHolder extends RecyclerView.ViewHolder{
        TextView textTime;
        TextView textTimetwo;
        public TableViewHolder(@NonNull View itemView) {
            super(itemView);
            textTime = (TextView) itemView.findViewById(R.id.textTime);
            textTimetwo = (TextView) itemView.findViewById(R.id.textTimetwo);
        }
    }


}
