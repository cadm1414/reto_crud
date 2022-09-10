package com.retocrud.repository;

import com.retocrud.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<user, Integer> {
	public user findByUserName(String userName);
}
