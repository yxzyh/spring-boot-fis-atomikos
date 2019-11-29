package com.fis.xiaolu.web.mapper.users;

import com.fis.xiaolu.web.entity.Users;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日下午2:59:00
 */
public interface UsersMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Users record);

	int insertSelective(Users record);

	Users selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Users record);

	int updateByPrimaryKey(Users record);
}
