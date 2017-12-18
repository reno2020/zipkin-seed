package org.throwable.dto;

import lombok.Data;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2017/12/18 22:13
 */
@Data
public class OrderUserDto {

	private String orderId;
	private Integer amount;
	private String name;
	private Integer userId;
}
