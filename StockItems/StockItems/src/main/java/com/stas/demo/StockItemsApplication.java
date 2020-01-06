package com.stas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * This application allows a user to update\delete\add items to stock 
 * please read the README file inside the StockItem folder!
 * @author Stanislav Omlyanchuk
 * @version (2020)
 */
@EnableSwagger2
@SpringBootApplication
public class StockItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockItemsApplication.class, args);
	}

}
