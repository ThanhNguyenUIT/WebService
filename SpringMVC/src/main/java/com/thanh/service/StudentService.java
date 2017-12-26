package com.thanh.service;

import com.thanh.Exercise1.Student;
import com.thanh.persistence.StudentDao;

import java.util.ArrayList;

public class StudentService {
    public static void insertStudents(ArrayList<Student> students){
        StudentDao.insertStudents(students);
    }
}
