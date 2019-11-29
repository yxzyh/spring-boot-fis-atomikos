package com.fis.xiaolu.web.entity;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日下午2:57:16
 */
public class Orders {
	
	private Integer id;
	private String name;
	private Integer userId;
	private Integer account;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getAccount() {
		return account;
	}
	public void setAccount(Integer account) {
		this.account = account;
	}
	
}
