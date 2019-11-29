package com.fis.xiaolu.web.service;

import com.fis.xiaolu.web.entity.Orders;
import com.fis.xiaolu.web.entity.Users;

/**
 * @Desc   描述。。。
 * @author XiaoLu.Su
 * @date   2019年11月29日下午3:07:20 
 */
public interface IOrderService {
    void addOrder(Orders orders, Users users);
}