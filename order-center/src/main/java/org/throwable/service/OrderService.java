package org.throwable.service;

import org.springframework.stereotype.Service;
import org.throwable.entity.Order;

import java.util.Random;
import java.util.UUID;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/18 22:10
 */
@Service
public class OrderService {

	private static final Random RANDOM = new Random(100);

	public Order getRandomOrder(){
		Order order = new Order();
		order.setOrderId(UUID.randomUUID().toString());
		order.setAmount(RANDOM.nextInt(100));
		return order;
	}
}
