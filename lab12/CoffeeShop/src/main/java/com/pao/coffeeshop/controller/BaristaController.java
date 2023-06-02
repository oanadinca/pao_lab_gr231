package com.pao.coffeeshop.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pao.coffeeshop.model.Order;
import com.pao.coffeeshop.service.BaristaService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/barista")
public class BaristaController {

	@Resource
	private BaristaService baristaService;

	@PostMapping("/order")
	public void postOrder(@RequestBody Order order) {
		baristaService.postOrder(order);
	}

}
