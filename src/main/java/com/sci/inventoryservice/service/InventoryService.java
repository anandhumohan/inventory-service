package com.sci.inventoryservice.service;

import com.sci.inventoryservice.model.Inventory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sci.inventoryservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
	
	private final InventoryRepository inventoryRepository;

	@Transactional(readOnly = true)
	public boolean isStock(String skuCode) {
		
		return inventoryRepository.findBySkuCode(skuCode).isPresent();
		
		
	}

    public List<InventoryResponse> getAllStocks() {
		List<Inventory> stocks = inventoryRepository.findAll();
		return stocks;
    }
}
