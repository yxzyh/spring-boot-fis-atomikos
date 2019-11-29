package com.fis.xiaolu.web.mapper.orders;

import com.fis.xiaolu.web.entity.Orders;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日下午3:04:52
 */
public interface OrdersMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Orders record);

	int insertSelective(Orders record);

	Orders selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Orders record);

	int updateByPrimaryKey(Orders record);
}