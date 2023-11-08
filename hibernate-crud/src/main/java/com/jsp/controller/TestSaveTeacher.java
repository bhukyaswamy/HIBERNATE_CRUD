package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class TestSaveTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher = new Teacher();
		teacher.setId(3);
		teacher.setName("sai");
		teacher.setPhone(3887499866l);
		teacher.setSal(140000);
		teacher.setSubject("sql2");
		
		TeacherService tS= new TeacherService();
		Teacher teacher2=tS.saveTeacher(teacher);
		if(teacher2!=null) {
			System.out.println("data saved");
			
		}
		else 
			System.out.println("please check the object..");

	}

}
