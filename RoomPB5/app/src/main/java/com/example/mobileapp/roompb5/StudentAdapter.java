package com.example.mobileapp.roompb5;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class StudentAdapter  extends ArrayAdapter<Student>{
    private Context context;
    private List<Student>students;
    public StudentAdapter(@NonNull Context context, List<Student>students) {
        super(context, R.layout.st_row, students);
        this.context = context;
        this.students = students;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context)
                .inflate(R.layout.st_row,parent,false);
        TextView nameTV = convertView.findViewById(R.id.row_name);
        TextView ageTV = convertView.findViewById(R.id.row_age);
        TextView deptTV = convertView.findViewById(R.id.row_dept);
        nameTV.setText(students.get(position).getStudentName());
        ageTV.setText(students.get(position).getStudentAge());
        deptTV.setText(students.get(position).getDepartment());
        return convertView;
    }
}
