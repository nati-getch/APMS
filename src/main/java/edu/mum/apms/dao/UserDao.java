package edu.mum.apms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.mum.apms.model.User;
import edu.mum.apms.model.UserRoleType;



public interface UserDao extends JpaRepository<User, Integer>{

//	User findById(int id);
	
//	User findByEmpId(String empId);
//	
//	void save(User user);
//	
//	void deleteByEmpId(String empId);
	
//	boolean addRole(String empId, UserRoleType role);
//	
//	List<User> findAllUsers();

}

