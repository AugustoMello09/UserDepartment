package com.jin.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jin.userdept.entities.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}
