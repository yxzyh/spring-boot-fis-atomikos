package com.fis.xiaolu.web.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fis.xiaolu.web.entity.Orders;
import com.fis.xiaolu.web.entity.Users;
import com.fis.xiaolu.web.mapper.orders.OrdersMapper;
import com.fis.xiaolu.web.mapper.users.UsersMapper;
import com.fis.xiaolu.web.service.IOrderService;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日下午3:08:16
 */
@Service
public class OrderServiceImpl implements IOrderService {
	@Resource
	private UsersMapper usersMapper;

	@Resource
	private OrdersMapper ordersMapper;

	@Override
	@Transactional
	public void addOrder(Orders orders, Users users) {
		usersMapper.insertSelective(users);
		int i = 10/0;
		ordersMapper.insertSelective(orders);
	}
}
