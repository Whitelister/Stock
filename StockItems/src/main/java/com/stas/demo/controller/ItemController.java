package com.stas.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stas.demo.dao.ItemInterface;
import com.stas.demo.model.Item;

@Controller
public class ItemController
{
	@Autowired
	ItemInterface itemInterface;

	/**
	 * home page
	 * @return "home.jsp"
	 */
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	/**
	 * Method to add items 
	 * @param item
	 * @return "home.jsp"
	 */
	@RequestMapping("/addItem")
	public String addItem(Item item)
	{
		itemInterface.save(item);
		return "home.jsp";
	}
	
	/**
	 * Method to get all items in stock
	 * @return all items, JSON format
	 */
	@RequestMapping("/getAllItems")
	@ResponseBody
	public List<Item> getAllItems()
	{
		return itemInterface.findAll();
	}
	
	/**
	 * Method to get item in stock with given index
	 * @param itemNo
	 * @return item, JSON format
	 */
	@RequestMapping("/getItem")
	@ResponseBody
	public Item getItem(@RequestParam int itemNo)
	{
		
		return itemInterface.findById(itemNo).orElse(new Item()); 
	}
	
	/**
	 * Method for deleting an item with given index
	 * @param itemNo
	 * @return "home.jsp"
	 */
	@RequestMapping("/deleteItem")
	public String deleteItem(@RequestParam int itemNo)
	{
		itemInterface.deleteById(itemNo);
		return "home.jsp";
	}
	
	/**
	 * Method for depositing quantity to specific item 
	 * @param amount
	 * @param itemNo
	 * @return "home.jsp"
	 */
	@Transactional
	@RequestMapping("/depositItem")
	public String depositItem(@RequestParam int amount, int itemNo)
	{
		itemInterface.depositItem(amount, itemNo);
		return "home.jsp";
	}
	
	/**
	 * Method for withdrawing specific item quantity
	 * @param itemNo
	 * @return amount
	 */
	@RequestMapping("/getItemQuantity")
	@ResponseBody
	public String getItemQuantity(@RequestParam int itemNo)
	{	
		return itemInterface.getItemQuantity(itemNo);
	}
	
}
