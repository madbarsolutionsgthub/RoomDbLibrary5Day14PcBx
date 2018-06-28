package com.example.mobileapp.roompb5;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "tbl_student")
public class Student {
    @PrimaryKey(autoGenerate = true)
    private int studentId;
    @ColumnInfo(name = "col_name")
    private String studentName;
    @ColumnInfo(name = "col_age")
    private String studentAge;
    @ColumnInfo(name = "col_dept")
    private String department;
    @Ignore
    private int count;

    public Student(String studentName, String studentAge, String department) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.department = department;
    }

    @Ignore
    public Student(int studentId, String studentName, String studentAge, String department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
