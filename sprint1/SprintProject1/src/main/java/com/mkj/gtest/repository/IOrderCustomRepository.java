package com.mkj.gtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mkj.gtest.entity.Order;

@Repository

public interface IOrderCustomRepository {
	
	public Order  getOrderByUserName(String userName) throws Exception;
	public Order getOrderByBookName(String bookName) throws Exception;
	public Order getOrderByOrderId(int orderIssssssd) throws Exception;
	@Query("from Order where orderId >= :range1 and orderId <= :range2")
	public List<Order> getOrdersBetweenIds(@Param("range1") int range1,@Param("range2") int range2)throws Exception;
}


