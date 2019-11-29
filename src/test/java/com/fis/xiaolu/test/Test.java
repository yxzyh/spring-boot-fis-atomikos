package com.fis.xiaolu.test;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fis.xiaolu.web.App;
import com.fis.xiaolu.web.entity.Orders;
import com.fis.xiaolu.web.entity.Users;
import com.fis.xiaolu.web.service.IOrderService;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日下午3:15:56
 */
@SpringBootTest(classes = { App.class })
@RunWith(SpringRunner.class)
public class Test {

	@Resource
	private IOrderService iOrderService;

	@org.junit.Test
	public void test1() {
		Users users = new Users();
		users.setUsername("enjoy");
		users.setPasswd("123");
		users.setId(2);

		Orders orders = new Orders();
		orders.setAccount(12);
		orders.setName("娃娃");
		orders.setUserId(2);
		iOrderService.addOrder(orders, users);
	}
}
