package com.caueruleum.pshop.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caueruleum.pshop.admin.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
