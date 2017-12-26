package com.thanh.service;
 
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.thanh.Exercise1.Student;
import com.thanh.Exercise2.DatabaseUtils;

@Path("/student")
public class StudentWebService {
	
   @GET
   @Produces("application/json")
   public String getStudents_JSON() {
	   
	   String result = "[";
	   
	   List<Student> students = DatabaseUtils.readStudents();
      
	   for(int i = 0; i < students.size(); i++) {
		       result += "{\"firstName\" : \"" + students.get(i).getFirstName() + "\","
		               + "\"lastName\" : \"" + students.get(i).getLastName() + "\","
		               + "\"birthDay\" : \"" + students.get(i).getBirthDay() + "\","
		               + "\"email\" : \"" + students.get(i).getEmail() 
		               + ((i != students.size()-1) ? "\"}," : "\"}");
	   }
	   
	   result += "]";
	   return result;
   } 
}