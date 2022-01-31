package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.claim.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	@Query("SELECT U FROM User U WHERE U.email = ?1 AND U.password = ?2")
	User findUserByLogIn(String email, String password);

}
