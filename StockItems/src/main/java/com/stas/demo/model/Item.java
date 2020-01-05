package com.stas.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item 
{
	@Id
int itemNo;
String name;
int amount;
int inventoryCode;
//constructor
	/**
	 * creates a new Item 
	 */
public Item()
{
	
}

/** get the item no
 * @return  itemNo
 */ 
public int getItemNo()
{
    return itemNo;
}

/** set item no
 * @param itemNo
 */
public void setItemNo(int itemNo)
{
    this.itemNo = itemNo;
}

/** get the name
 * @return  name
 */ 
public String getName()
{
    return name;
}

/** set name
 * @param name
 */
public void setName(String name)
{
    this.name = name;
}

/** get the amount
 * @return  amount
 */
public int getAmount()
{
    return amount;
}

/** set amount
 * @param amount
 */
public void setAmount(int amount) 
{
    this.amount = amount;
}

/** get the inventory code
 * @return  inventoryCode
 */
public int getInventoryCode() 
{
    return inventoryCode;
}

/** set the inventory code
 * @param inventoryCode
 */
public void setInventoryCode(int inventoryCode)
{
    this.inventoryCode = inventoryCode;
}

/** toString method
 */
@Override
public String toString()
{
    return "Item [itemNo=" + itemNo + ", name=" + name + ", amount=" + amount + ", inventoryCode=" + inventoryCode
            + "]";
}

}