package org.throwable.service;

import org.springframework.stereotype.Service;
import org.throwable.entity.User;

import java.util.Random;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/18 22:23
 */
@Service
public class UserService {
	private static final Random RANDOM = new Random(100);

	public User getRandomUser(){
		User user = new User();
		user.setName("doge-" + RANDOM.nextInt(1000));
		user.setUserId(RANDOM.nextInt(10000));
		return user;
	}
}
