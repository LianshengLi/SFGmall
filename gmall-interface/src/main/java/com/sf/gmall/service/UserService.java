package com.sf.gmall.service;

import com.sf.gmall.bean.UserAddress;
import java.util.List;

/**
 * 用户服务
 * @author LianshengLi
 *
 */
public interface UserService {
	
	/**
	 * 按照用户id返回所有的收货地址
	 * @param userId
	 * @return
	 */
	List<UserAddress> getUserAddressList(String userId);

}
