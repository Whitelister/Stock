package com.stas.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.stas.demo.model.Item;

public interface ItemInterface extends JpaRepository<Item,Integer>
{
	/**
	 * Method for depositing quantity to specific item 
	 * @param amount
	 * @param itemNo
	 */
	@Modifying    
	@Query(value="UPDATE item SET amount=? WHERE item_no=?",nativeQuery = true)
	public void depositItem(int amount, int itemNo);
	
	/**
	 * Method for withdrawing specific item quantity
	 * @param itemNo
	 * @return amount
	 */
	@Query(value="SELECT amount FROM item WHERE item_no=?",nativeQuery = true)
	public String getItemQuantity(int itemNo);
}
