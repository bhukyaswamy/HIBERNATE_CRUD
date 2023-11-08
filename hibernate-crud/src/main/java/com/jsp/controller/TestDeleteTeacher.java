package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TestDeleteTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherService tS= new TeacherService();
			Teacher teacher =tS.deleteTeacher(1);
			if(teacher!=null) {
				System.out.println("data is deleted");
				
			}
			else 
				System.out.println("please check the id");
	}

}
