package com.thanh.persistence;

import com.thanh.Exercise1.Student;
import com.thanh.Exercise2.DatabaseUtils;

import java.util.ArrayList;

public class StudentDao {
    public static void insertStudents(ArrayList<Student> students){
        DatabaseUtils.insertStudents(students);
    }
}
