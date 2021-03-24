package com.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.google.gson.Gson;


@WebServlet("/addstudent")
public class AddStudent extends HttpServlet {
	
	/**
	 * 
	 */
	
	
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		Gson gson=null;
		gson = new Gson();
		BufferedReader br = 
					new BufferedReader(new InputStreamReader(request.getInputStream()));
			String json = "";
			if(br != null){
				json = br.readLine();
				System.out.println(json);
			}
		Student student=gson.fromJson(json, Student.class);
		System.out.println(student.toString());
		
			
		
		
	}
}
