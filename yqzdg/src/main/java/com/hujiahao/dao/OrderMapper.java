package com.hujiahao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hujiahao.model.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    //测试数据库连接
    Order selectById(@Param("orderId") Integer orderId);
    
    //查询订单所有数据
    List<Order> selectOrderAndBusinessType(@Param("orderStatus") Integer orderStatus);
    
    //更新订单---订单：未匹配→未完成
    int updateToUnFinish(@Param("orderId") Integer orderId ,@Param("changedStatus")Integer changedStatus,@Param("wiremanId")Integer wiremanId);
    
  //更新订单---订单：未完成→未评价
    int updateToFinish(@Param("orderId") Integer orderId ,@Param("changedStatus")Integer changedStatus);
    
    //删除
	int deletOrderInfo(Integer orderId);
	
	//查询前三条
	List<Order> selectOrderToLimit(Integer orderStatus);
	
	//更新remark 用户评价
	int updateOrderRemarkByOrderId(@Param("remark") String remark, @Param("orderId") Integer orderId);
}