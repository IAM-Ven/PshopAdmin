package com.caueruleum.pshop.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caueruleum.pshop.admin.entity.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Integer>{

}
