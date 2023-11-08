package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Teacher;

public class TeacherDao {
	static EntityManagerFactory eMF=Persistence.createEntityManagerFactory("god");
	
	public Teacher saveTeacher(Teacher teacher) {
		EntityManager eM=eMF.createEntityManager();
		EntityTransaction eT=eM.getTransaction();
		
		if(teacher!=null) {
			eT.begin();
			eM.persist(teacher);
			eT.commit();
		}
		return teacher;
	}
	  
	public Teacher updateTeacher(Teacher teacher) {
		
		EntityManager eM=eMF.createEntityManager();
		EntityTransaction eT=eM.getTransaction();
		Teacher teacher1 = eM.find(Teacher.class, teacher.getId());
		if(teacher1!=null) {
			eT.begin();
			eM.merge(teacher);
			eT.commit();
			
		}
		return teacher;
	}

	public List<Teacher> getAllTeacher(){
	EntityManager eM=eMF.createEntityManager();
	Query query=eM.createQuery("select a from Teacher a");
	return query.getResultList();
	}
	
	public Teacher getTeacherById(int id) {
		EntityManager eM=eMF.createEntityManager();
		return eM.find(Teacher.class, id);
		
	}
	
	
	public Teacher deleteTeacher(int id) {
		
		EntityManager eM=eMF.createEntityManager();
		EntityTransaction eT=eM.getTransaction();
		Teacher teacher = eM.find(Teacher.class, id);
		if(teacher!=null) {
			eT.begin();
			eM.remove(teacher);
			eT.commit();
			
		}
		return teacher;
	}
	

}
