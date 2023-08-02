package com.itgarden.controller;

import com.itgarden.dto.KitchenOrderInfo;
import com.itgarden.messages.ResponseMessage;
import com.itgarden.repository.KitchenOrderRepository;
import com.itgarden.service.bo.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/private")
public class KitchenOrderController {

	@Autowired
	private KitchenService kitchenService;

	@Autowired
	private KitchenOrderRepository kitchenOrderRepository;

	@PostMapping("/kitchen")
	public ResponseEntity<ResponseMessage<?>> add(@RequestBody KitchenOrderInfo kitchenOrderInfo) {
		ResponseMessage responseMessage = kitchenService.save(kitchenOrderInfo);
		return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.OK);

	}
}
