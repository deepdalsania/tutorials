package com;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class UserDetailsDao {

	Session session = null;
	Transaction transaction = null;
	SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	
	public void addUser(UserDetailsModel model) {
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(model);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally{
			//session.flush();
			session.close();
		}
	}
	
	public void updateUser(UserDetailsModel model) {
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.save(model);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally{
			//session.flush();
			session.close();
		}
	}
	
	public void deleteUser(long id) {
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			UserDetailsModel model = (UserDetailsModel) session.load(UserDetailsModel.class, new Long(id));
			session.save(model);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally{
			//session.flush();
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<UserDetailsModel> getAllUsers() {
		List<UserDetailsModel> userList = new ArrayList<UserDetailsModel>();
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			userList = session.createQuery("from USERDETAILS").list();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally{
			//session.flush();
			session.close();
		}
		return userList;
	}
	
	public UserDetailsModel getUserById(long userId) {
		
		UserDetailsModel model = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery("from USERDETAILS where ID = :id");
			query.setLong("id", userId);
			model = (UserDetailsModel) query.uniqueResult();
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}finally{
			//session.flush();
			session.close();
		}
		return model;
	}
	
}
