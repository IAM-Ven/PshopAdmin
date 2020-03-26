package com.caueruleum.pshop.admin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caueruleum.pshop.admin.entity.OrderStatus;

public interface OrderStatusRepository extends JpaRepository<OrderStatus, Integer>{

}
