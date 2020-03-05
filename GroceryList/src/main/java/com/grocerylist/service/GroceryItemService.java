package com.grocerylist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerylist.dao.GroceryItemDao;
import com.grocerylist.model.GroceryItem;

@Service
public class GroceryItemService {
	
	@Autowired
	GroceryItemDao gd;
	
	public GroceryItem findById(int id)
	{
		return gd.findById(id).get();
	}
	
	public List<GroceryItem> findAll()
	{
		return (List<GroceryItem>) gd.findAll();
	}
	
	public void save(GroceryItem gi)
	{
		gd.save(gi);
	}
	
	public void update(GroceryItem gi)
	{
		gd.save(gi);
	}
	
	public void delete(GroceryItem gi)
	{
		gd.delete(gi);
	}
}
