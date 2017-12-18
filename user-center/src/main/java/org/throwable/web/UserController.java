package org.throwable.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.throwable.entity.User;
import org.throwable.service.UserService;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/18 22:25
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/user",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public User getUser(){
		return userService.getRandomUser();
	}
}
