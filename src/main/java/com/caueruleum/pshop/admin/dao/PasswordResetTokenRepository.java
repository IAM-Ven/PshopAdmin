package com.caueruleum.pshop.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caueruleum.pshop.admin.entity.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer>{

}
