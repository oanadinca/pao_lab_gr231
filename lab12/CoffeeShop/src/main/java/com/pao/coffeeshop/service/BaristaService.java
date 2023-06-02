package com.pao.coffeeshop.service;

import java.util.List;

import com.pao.coffeeshop.model.Barista;
import com.pao.coffeeshop.model.Coffee;
import com.pao.coffeeshop.model.Order;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BaristaService {

	private Barista barista;

	public BaristaService() {
		this.barista = new Barista(1L, "Oana", List.of());
	}

	public String postOrder(Order order) {
		barista.getOrders().add(order);
		return "ok";
	}

}
