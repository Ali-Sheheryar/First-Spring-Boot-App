package com.example.JPAProject.DAO;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.example.JPAProject.entities.user;

public interface UserRepo extends CrudRepository<user, Integer> {

	public user findById(int id);
//	public List<user> findByNameAndCity(String name, String city);
	
//	@Query("Select u from user u where u.name =:a u.city=:b")
//	public List<user> getByNameAndCity(@Param("a") String name,@Param("b") String city);
//	
//	@Query("Select u from user u where u.name =:a and u.city =:b")
//	public List<user> getByNameAndCity(@Param("a") String name, @Param("b") String city);
//	
//	@Query(value="select * from user",nativeQuery=true)
//	public List<user> getAllUsers();
}
