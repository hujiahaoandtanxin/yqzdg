package com.hujiahao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hujiahao.dao.OrderMapper;
import com.hujiahao.model.Order;


@Service
public class OrderService {
	@Autowired
	OrderMapper orderMapper;
	 
	public void saveOrder(Order record) {
		orderMapper.insertSelective(record);
	}
}