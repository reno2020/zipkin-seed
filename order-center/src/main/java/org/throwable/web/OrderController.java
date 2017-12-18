package org.throwable.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.throwable.dto.OrderUserDto;
import org.throwable.entity.Order;
import org.throwable.service.OrderService;
import org.throwable.vo.UserVo;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/18 22:12
 */
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value = "/order", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public OrderUserDto getUserOrderInfo() {
		OrderUserDto dto = new OrderUserDto();
		ResponseEntity<UserVo> entity = restTemplate.getForEntity("http://localhost:9092/user", UserVo.class);
		UserVo userVo = entity.getBody();
		if (null != userVo) {
			dto.setUserId(userVo.getUserId());
			dto.setName(userVo.getName());
		}
		Order order = orderService.getRandomOrder();
		dto.setOrderId(order.getOrderId());
		dto.setAmount(order.getAmount());
		return dto;
	}
}
