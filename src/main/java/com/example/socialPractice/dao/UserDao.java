package com.example.socialPractice.dao;

import com.example.socialPractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Repository
@Table(name = "user")
public interface UserDao extends JpaRepository<User,String> {
}
