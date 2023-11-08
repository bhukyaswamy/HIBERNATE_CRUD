package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TestUpdateTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.setId(2);
		teacher.setName("swamyx");
		teacher.setPhone(999993993l);
		teacher.setSubject("core java");
		teacher.setSal(38837839);
		
		TeacherService tS=new TeacherService();
		Teacher teacher2=tS.updateTeacher(teacher);
		if(teacher2!=null) {
			System.out.println("data is updated");
		}
		else 
			System.out.println("please check the id");
	}

}
