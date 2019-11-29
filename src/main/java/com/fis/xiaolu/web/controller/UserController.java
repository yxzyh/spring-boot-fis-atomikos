package com.fis.xiaolu.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc 描述。。。
 * @author XiaoLu.Su
 * @date 2019年11月29日下午2:12:41
 */
@RestController
public class UserController {

	@RequestMapping("/hi")
	public Object sayHi() {
		return "hi enjoy";
	}
}
