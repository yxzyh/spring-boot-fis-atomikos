package com.fis.xiaolu.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日下午4:04:52
 */
@ConfigurationProperties(prefix = "spring.datasource.spring")
@Component
public class DBConfig1 {
	private String driverClassName;
	private String jdbcUrl;
	private String username;
	private String password;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
