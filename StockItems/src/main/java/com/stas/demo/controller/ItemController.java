package com.stas.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.Documented;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.stas.demo.dao.ItemInterface;
import com.stas.demo.model.Item;

@RestController
@RequestMapping("/")
public class ItemController
{
	@Autowired	
	ItemInterface itemInterface;
	ModelAndView mvHome = new ModelAndView("home.jsp");
	/**
	 * home page
	 * @return mvHome
	 */
	@GetMapping("")
	public ModelAndView home()
	{
		return mvHome;
	}
	
	/**
	 * Method to add items 
	 * @param item
	 * @return mvHome
	 */
	
	@GetMapping("/addItem")
	public ModelAndView addItem(Item item)
	{
		itemInterface.save(item);
		return mvHome;
	}
	
	/**
	 * Method to get all items in stock
	 * @return Item list
	 */
	@GetMapping("/getAllItems")
	public List<Item> getAllItems()
	{
		return itemInterface.findAll();
	}
	
	/**
	 * Method to get item in stock with given index
	 * @param itemNo
	 */
	@GetMapping("/getItem")
	public Item getItem(@RequestParam int itemNo)
	{
		
	    return itemInterface.findById(itemNo).orElse(new Item()); 
	}
	
	/**
	 * Method for deleting an item with given index
	 * @param itemNo
	 * @return mvHome
	 */
	@GetMapping("/deleteItem")
	public ModelAndView deleteItem(@RequestParam int itemNo)
	{
		itemInterface.deleteById(itemNo);
		return mvHome;
	}
	
	/**
	 * Method for depositing quantity to specific item 
	 * @param amount
	 * @param itemNo
	 * @return mvHome
	 */
	@Transactional
	@GetMapping("/depositItem")
	public ModelAndView depositItem(@RequestParam int amount, int itemNo)
	{
		itemInterface.depositItem(amount, itemNo);
		return mvHome;
	}
	
	/**
	 * Method for withdrawing specific item quantity
	 * @param itemNo
	 * @return amount
	 */
	@GetMapping("/getItemQuantity")
	public String getItemQuantity(@RequestParam int itemNo)
	{	
		return itemInterface.getItemQuantity(itemNo);
	}
	
}
