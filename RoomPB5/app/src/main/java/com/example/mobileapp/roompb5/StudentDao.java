package com.example.mobileapp.roompb5;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    long insertStudent(Student student);

    @Update
    int updateStudent(Student student);

    @Delete
    int deleteStudent(Student student);

    @Query("select * from tbl_student")
    List<Student>getAllStudents();

    @Query("select * from tbl_student where studentId like:id")
    Student getAllStudents(int id);
}
