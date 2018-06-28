package com.example.mobileapp.roompb5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<Student>students = new ArrayList<>();
    private StudentAdapter adapter;
    private EditText nameET, ageET, deptET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        nameET = findViewById(R.id.st_name);
        ageET = findViewById(R.id.st_age);
        deptET = findViewById(R.id.st_dept);
        updateUI();
    }

    public void saveStudent(View view) {
        String name = nameET.getText().toString();
        String age = ageET.getText().toString();
        String dept = deptET.getText().toString();
        Student student = new Student(name,age,dept);
        long insertedRow = StudentDatabase.getInstance(this).getDao().insertStudent(student);
        if(insertedRow > 0){
            Toast.makeText(this, "saved", Toast.LENGTH_SHORT).show();
            updateUI();
        }else{
            Toast.makeText(this, "failed", Toast.LENGTH_SHORT).show();
        }
    }
    private void updateUI(){
        students.clear();
        students = StudentDatabase.getInstance(this).getDao().getAllStudents();
        adapter = new StudentAdapter(this,students);
        listView.setAdapter(adapter);
    }
}
