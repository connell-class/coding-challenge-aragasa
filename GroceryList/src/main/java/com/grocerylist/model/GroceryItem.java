package com.grocerylist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class GroceryItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int itemId;
	@Column(unique = true)
	private String itemType;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "groceryItems")
	private GroceryList groceryItems;

	public int getItemId() {
		return itemId;
	}

	public GroceryItem() {
		super();
	}

	public GroceryItem(int itemId, String itemType, GroceryList groceryItems) {
		super();
		this.itemId = itemId;
		this.itemType = itemType;
		this.groceryItems = groceryItems;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groceryItems == null) ? 0 : groceryItems.hashCode());
		result = prime * result + itemId;
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GroceryItem other = (GroceryItem) obj;
		if (groceryItems == null) {
			if (other.groceryItems != null)
				return false;
		} else if (!groceryItems.equals(other.groceryItems))
			return false;
		if (itemId != other.itemId)
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroceryItem [itemId=" + itemId + ", itemType=" + itemType + ", groceryItems=" + groceryItems + "]";
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public GroceryList getGroceryItems() {
		return groceryItems;
	}

	public void setGroceryItems(GroceryList groceryItems) {
		this.groceryItems = groceryItems;
	}

}
