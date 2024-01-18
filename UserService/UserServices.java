package com.example.JPAProject.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JPAProject.DAO.UserRepo;
import com.example.JPAProject.entities.*;

@Service
public class UserServices {

	@Autowired
	private UserRepo UR;
//	private static List<user> list = new ArrayList<>();
//	
//	static {
//		list.add(new user(1,"Ali","lhr","reg"));
//		list.add(new user(2,"Asim","UK","prp"));
//		list.add(new user(4,"Asad","lhr","ROR"));
//	}
	
	//to show all users
	public List<user> getUsers(){
		List<user> list = (List<user>) this.UR.findAll();
		return list;
	}
	
	//to show user by id
	public user getUserById(int id) {
		user u = UR.findById(id);
		//user u = list.stream().filter(e->e.getId()==id).findFirst().get();
		return u;
	}
	
	//to create user
	public user addUser(user u) {
		user v = this.UR.save(u);
		return v;
	}
	
	//to delete a user
	public void deleteUser(int id) {
		//List<user> u = list.stream().filter(e->e.getId()==id).collect(Collectors.toList());
		this.UR.deleteById(id);
	}
	
	//to update a user
	public void updateUser(user u, int id) {
//		list = list.stream().map(b->{
//			if(b.getId()==id) {
//				b.setName(u.getName());
//				b.setCity(u.getCity());
//				b.setStatus(u.getStatus());
//			}
//			return b;
//		}).collect(Collectors.toList());
		u.setId(id);
		this.UR.save(u); 
	}
}
