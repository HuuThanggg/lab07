package com.example.lab06;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ToDoAdapter extends ArrayAdapter<ToDo> {
    private List<ToDo> tasks;
    private Context context;

    private List<ToDo> taks;

    public ToDoAdapter(Context context, List<ToDo> tasks) {
        super(context, 0, tasks);

        this.context = context;
        this.tasks = tasks;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ToDo task = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_todo, parent, false);
        }
        TextView taskTitle = convertView.findViewById(R.id.task_title);
        TextView taskContent = convertView.findViewById(R.id.task_content);
        TextView taskDate = convertView.findViewById(R.id.task_date);
        TextView taskType = convertView.findViewById(R.id.task_type);
        taskTitle.setText(task.getTitle());
        taskContent.setText(task.getContent());
        taskDate.setText(task.getDate());
        taskType.setText(task.getType());
        return convertView;
    }
}
