package com.caueruleum.pshop.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caueruleum.pshop.admin.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
