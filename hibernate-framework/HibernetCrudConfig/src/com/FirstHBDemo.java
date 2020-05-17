package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstHBDemo {

	public static void main(String[] args) {
		
		Session session = null;
		Transaction transaction = null;
		try {
			
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		
		System.out.println("Please Insert Documnet");
		UserInfo info = new UserInfo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id : ");
		long id = scanner.nextLong();
		info.setId(id);
		System.out.println("Enter FirstName : ");
		String fName = scanner.next();
		info.setFirstName(fName);
		System.out.println("Enter LastName : ");
		String lName = scanner.next();
		info.setLastName(lName);
		System.out.println("Enter password : ");
		String pw = scanner.next();
		info.setPassword(pw);
		transaction = session.beginTransaction();
		session.save(info);
		session.getTransaction().commit();
		System.out.println("Data Inserted Successfully");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			//session.flush();
			//session.close();
		}
	}
}
