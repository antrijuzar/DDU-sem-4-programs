package com.lab10.hibernate.CRUD;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DbOperations {
	static Session session;
	static SessionFactory sessionFactoryObj;
	
	public final static Logger LOGGER = Logger.getLogger(DbOperations.class);
	
	private static SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		sessionFactoryObj = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactoryObj;
	}
	
	public static void createRecord() {
		int count = 0;
		Student studentObj = null;
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			for(int i = 1; i < 6; i++) {
				count++;
				studentObj = new Student();
				studentObj.setRollNumber(String.valueOf(i));
				studentObj.setStudentName("Student "+i);
				studentObj.setCourse("Bachelor Of Technology");
				session.save(studentObj);
			}
			session.getTransaction().commit();
			LOGGER.info("\nSuccessfully Created "+count+" Records In The Database!\n");
		}catch (Exception e) {
			if(null != session.getTransaction()){
				LOGGER.info("\n............. Transaction Is Beign Rolled Back .............\n");
				session.getTransaction().rollback();
			}
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	public static List displayRecords() {
		List studentList = new ArrayList();
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			studentList = session.createQuery(" FROM Student").list();
		}catch (Exception e) {
			if(null != session.getTransaction()){
				LOGGER.info("\n............. Transaction Is Beign Rolled Back .............\n");
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}finally {
			if(session != null) {
				session.close();
			}
		}
		return studentList;
	}
	
	public static void updateRecord(int student_id) {
		try {
			session = buildSessionFactory().openSession();
			session.beginTransaction();
			
			Student stuObj = (Student) session.get(Student.class, student_id);
			if(stuObj != null) {
				stuObj.setCourse("Master Of Technology");
				session.update(stuObj);
				LOGGER.info("\nSuccessfully Updated ID: "+student_id+" In The Database!\n");
			}
			session.getTransaction().commit();
			
		}catch (Exception e) {
			if(null != session.getTransaction()){
				LOGGER.info("\n............. Transaction Is Beign Rolled Back .............\n");
				session.getTransaction().rollback();
			}
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
	
	public static void deleteRecord(int student_id) {
		try {
			session = sessionFactoryObj.openSession();
			session.beginTransaction();
			
			Student studObj = findRecordById(student_id);
			session.delete(studObj);
			
			session.getTransaction().commit();
			LOGGER.info("\nStudent With Id?= " + student_id + " Is Successfully Deleted From The Database!\n");
		}catch (Exception e) {
			if(null != session.getTransaction()){
				LOGGER.info("\n............. Transaction Is Beign Rolled Back .............\n");
				session.getTransaction().rollback();
			}
		}finally {
			if(session != null) {
				session.close();
			}
				
		}
	}
	
	public static Student findRecordById(int find_student_id) {
		Student findStudentObj = null;
		try {
			session = sessionFactoryObj.openSession();
			session.beginTransaction();
			
			findStudentObj = (Student) session.load(Student.class, find_student_id);
		} catch (Exception e) {
			if(null != session.getTransaction()){
				LOGGER.info("\n............. Transaction Is Beign Rolled Back .............\n");
				session.getTransaction().rollback();
			}
			e.printStackTrace();
		}
		return findStudentObj;
	}
	
	public static void deleteAllRecords() {
		try {
			session = sessionFactoryObj.openSession();
			session.beginTransaction();
			
			Query queryObj = session.createQuery("DELETE FROM Student");
			queryObj.executeUpdate();
			session.getTransaction().commit();
            LOGGER.info("\nSuccessfully Deleted All Records From The Database Table!\n");
		} catch (Exception e) {
			if(null != session.getTransaction()){
				LOGGER.info("\n............. Transaction Is Beign Rolled Back .............\n");
				session.getTransaction().rollback();
			}
		}finally {
			if(session != null) {
				session.close();
			}
		}
	}
}
