package com.sci.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sci.inventoryservice.model.Inventory;
import com.sci.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory Inventory1 = new Inventory();
			Inventory1.setSkuCode("phone 1");
			Inventory1.setQuantity(1);
			
			Inventory Inventory2 = new Inventory();
			Inventory2.setSkuCode("phone 2");
			Inventory2.setQuantity(1);
			
			Inventory Inventory3 = new Inventory();
			Inventory3.setSkuCode("phone 3");
			Inventory3.setQuantity(1);
			
			inventoryRepository.save(Inventory1);
			inventoryRepository.save(Inventory1);
			inventoryRepository.save(Inventory3);
			
			
			
		};
		
	}

}
