package com.nkjy.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<CourseModel> courseModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        recyclerView = findViewById(R.id.recyclerView);

        courseModelArrayList = new ArrayList<>();
        courseModelArrayList.add(new CourseModel("The Complete Android 12 Developer Course", R.drawable.course_one));
        courseModelArrayList.add(new CourseModel("The Complete Java Developer Course", R.drawable.course_two));
        courseModelArrayList.add(new CourseModel("The Complete Kotlin Course", R.drawable.course_three));
        courseModelArrayList.add(new CourseModel("The Complete Data Structure and Algorithm Course", R.drawable.course_four));

        MyAdapter adapter = new MyAdapter(this, courseModelArrayList);
        RecyclerView.LayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

}