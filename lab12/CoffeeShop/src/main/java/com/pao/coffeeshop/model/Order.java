package com.pao.coffeeshop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class Order {
	private Long id;
	private Coffee coffeeType;

}
