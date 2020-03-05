package com.grocerylist.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class GroceryList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int listId;
	@Column
	private String listName;
	@Column
	private String listCreator;
	@OneToMany(mappedBy = "groceryItems", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private List<GroceryItem> groceryItems;

	public int getListId() {
		return listId;
	}

	public void setListId(int listId) {
		this.listId = listId;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public String getListCreator() {
		return listCreator;
	}

	public void setListCreator(String listCreator) {
		this.listCreator = listCreator;
	}

	public List<GroceryItem> getGroceryItems() {
		return groceryItems;
	}

	public void setGroceryItems(List<GroceryItem> groceryItems) {
		this.groceryItems = groceryItems;
	}

	public GroceryList(int listId, String listName, String listCreator, List<GroceryItem> groceryItems) {
		super();
		this.listId = listId;
		this.listName = listName;
		this.listCreator = listCreator;
		this.groceryItems = groceryItems;
	}

	public GroceryList() {
		super();
	}

	@Override
	public String toString() {
		return "GroceryList [listId=" + listId + ", listName=" + listName + ", listCreator=" + listCreator
				+ ", groceryItems=" + groceryItems + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groceryItems == null) ? 0 : groceryItems.hashCode());
		result = prime * result + ((listCreator == null) ? 0 : listCreator.hashCode());
		result = prime * result + listId;
		result = prime * result + ((listName == null) ? 0 : listName.hashCode());
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
		GroceryList other = (GroceryList) obj;
		if (groceryItems == null) {
			if (other.groceryItems != null)
				return false;
		} else if (!groceryItems.equals(other.groceryItems))
			return false;
		if (listCreator == null) {
			if (other.listCreator != null)
				return false;
		} else if (!listCreator.equals(other.listCreator))
			return false;
		if (listId != other.listId)
			return false;
		if (listName == null) {
			if (other.listName != null)
				return false;
		} else if (!listName.equals(other.listName))
			return false;
		return true;
	}

}
