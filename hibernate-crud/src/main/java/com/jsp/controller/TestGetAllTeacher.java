 package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TestGetAllTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherService tS= new TeacherService();
		List <Teacher> list=tS.getAllTeacher();
		
		if(list.size()>0) {
			for(Teacher teacher: list) {
				System.out.println(teacher.getId());
				System.out.println(teacher.getName());
				System.out.println(teacher.getPhone());
				System.out.println(teacher.getSubject());
				System.out.println(teacher.getSal());
				System.out.println("*********************");
			}
			
		}

	}

}
