package com.sf.gmall.service;


import com.sf.gmall.bean.UserAddress;
import java.util.List;

public interface OrderService {
	
	/**
	 * 初始化订单
	 * @param userId
	 */
	List<UserAddress> initOrder(String userId);

}
