package com.thanh.controllers;

import com.thanh.Exercise1.FileUtils;
import com.thanh.Exercise1.Student;
import com.thanh.Exercise2.DatabaseUtils;
import com.thanh.service.FileService;

import com.thanh.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UploadController extends HttpServlet {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request) {

        String fileUrl = FileService.storeFileUploaded(request);

        if (fileUrl.equals("")) {
            request.setAttribute("isStored", "Fail!");
        } else {
            request.setAttribute("isStored", "Upload Success!");

            List<Student> students = FileService.getListStudent(fileUrl);

            StudentService.insertStudents((ArrayList<Student>) students);
        }
        return "upload";
    }
}