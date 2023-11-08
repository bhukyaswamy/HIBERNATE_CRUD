package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {
	TeacherDao dao1 = new TeacherDao();
	public Teacher saveTeacher(Teacher teacher) {
		return dao1.saveTeacher(teacher);
		
	}
	public Teacher updateTeacher(Teacher teacher) {
		return dao1.updateTeacher(teacher);
	}
	public List<Teacher> getAllTeacher(){
		return dao1.getAllTeacher();
	}
	public Teacher getTeacherById(int id) {
		return dao1.getTeacherById(id);
		
	}
	public Teacher deleteTeacher(int id) {
		return dao1.deleteTeacher(id);
	}
	
	
	

}
