package com.stas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * This application allows a user to update\delete\add items to stock 
 * @author Stanislav Omlyanchuk
 * @version (2020)
 */
@SpringBootApplication
public class StockItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockItemsApplication.class, args);
	}

}
