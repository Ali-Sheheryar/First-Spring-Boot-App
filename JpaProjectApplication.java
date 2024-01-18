package com.example.JPAProject;

import java.util.*;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.JPAProject.DAO.UserRepo;
import com.example.JPAProject.entities.user;

@SpringBootApplication
//@ComponentScan( basePackages = {"com.example.JPAProject"})
public class JpaProjectApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(JpaProjectApplication.class, args);
		UserRepo ur = context.getBean(UserRepo.class);
		
		//To create
//		user user1 = new user();
//		user1.setName("Kaleem");
//		user1.setCity("RD");
//		user1.setStatus("CL20");
//		user user = ur.save(user1); //to save single user
//		System.out.println(user);
//		List<user> users = List.of(user1); //to save multiple users
//		Iterable<user> result = ur.saveAll(users);
		
		//To update
//		Optional<user> opt = ur.findById(1);
//		user user = opt.get();
//		user.setName("Shery");
//		user res = ur.save(user);
//		System.out.println(res);
		
		//To Get/Select
//		Optional<user> opt = ur.findById(1);
//		user user = opt.get();
//		System.out.println(user);
		
//		Iterable<user> itr = ur.findAll();
//		Iterator<user> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			user user = iterator.next();
//			System.out.println(user);
//		}
		
//		itr.forEach(user -> {System.out.println(user);}
//				);
		
		//To delete
//		ur.deleteById(52);
//		Iterable<user> itr = ur.findAll();
//		itr.forEach(user -> {System.out.println(user);}
//		);
		
//		Iterable<user> itr = ur.findAll();
//		ur.deleteAll(itr);
		
		//Custom method
	//	List<user> users = ur.getByNameAndCity("Shery","SGD");
		//users.forEach(u -> System.out.println(u));
		
		//ur.getAllUsers().forEach(u -> System.out.println(u));
	}

}
