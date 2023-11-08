 package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TestGetTeacherById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherService tS= new TeacherService();
		Teacher teacher =tS.getTeacherById(1);
		if(teacher!=null) {
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getPhone());
			System.out.println(teacher.getSubject());
			System.out.println(teacher.getSal());
		}
		else 
			System.out.println("please check the id..");
			
		}
	}


