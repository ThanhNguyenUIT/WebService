package com.thanh.controllers;

import com.thanh.Exercise1.Student;
import com.thanh.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ReadController {
    @RequestMapping(value = "/read", method = RequestMethod.POST)
    public String showRead(){
        return "read";
    }
}
