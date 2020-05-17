package com;

import java.util.Scanner;

public class UserDetailsController {

	public static void main(String[] args) {
		
		UserDetailsDao dao = new UserDetailsDao();
		
		//add user
		System.out.println("Please Insert Documnet");
		UserDetailsModel userDetailsModel = new UserDetailsModel();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id : ");
		long id = scanner.nextLong();
		userDetailsModel.setId(id);
		System.out.println("Enter Username : ");
		String uName = scanner.next();
		userDetailsModel.setUname(uName);
		System.out.println("Enter Password : ");
		String pw = scanner.next();
		userDetailsModel.setPassword(pw);
		dao.addUser(userDetailsModel);
		
		/*//update user
		System.out.println("Enter Id : ");
		long id = scanner.nextLong();
		userDetailsModel.setId(id);
		System.out.println("Enter Username : ");
		String uName = scanner.next();
		dao.updateUser(userDetailsModel);*/
		
		/*//delete user
		System.out.println("Enter Id : ");
		long id = scanner.nextLong();
		dao.deleteUser(id);*/
		
		/*//get all user
		for (UserDetailsModel model : dao.getAllUsers()) {
			System.out.println(model);
		}
		*/
		/*//get user by id
		System.out.println("Enter Id : ");
		long id = scanner.nextLong();
		System.out.println(dao.getUserById(id));*/
	}
	
	
}
