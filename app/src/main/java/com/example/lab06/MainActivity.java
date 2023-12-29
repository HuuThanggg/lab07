package com.example.lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

        ListView todoListView;

        @SuppressLint("MissingInflatedId")
        protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        todoListView = findViewById(R.id.todoListView);

        ToDoDao toDoDAO = new ToDoDao(this);
                ArrayList<ToDo> list = toDoDAO.getListTodo();

        ToDoAdapter toDoAdapter = new ToDoAdapter (this,list);
            todoListView.setAdapter(toDoAdapter);
}
}