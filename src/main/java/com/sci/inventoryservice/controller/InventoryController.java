package com.sci.inventoryservice.controller;

import com.sci.inventoryservice.model.Inventory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sci.inventoryservice.service.InventoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
	
	private final InventoryService inventoryService;
	
	@GetMapping("/{sku-code}")
	@ResponseStatus(HttpStatus.OK)
	public boolean isStock(@PathVariable("sku-code") String skuCode) {
		
		return inventoryService.isStock(skuCode);
		
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<InventoryResponse> getAllStocks(){
		return inventoryService.getAllStocks();
	}

}
