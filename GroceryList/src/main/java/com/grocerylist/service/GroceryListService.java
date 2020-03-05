package com.grocerylist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grocerylist.dao.GroceryListDao;
import com.grocerylist.model.GroceryList;

@Service
public class GroceryListService {

	@Autowired
	GroceryListDao gd;
	
	public GroceryList findById(int id)
	{
		return gd.findById(id).get();
	}
	
	public List<GroceryList> findAll()
	{
		return (List<GroceryList>) gd.findAll();
	}
	
	public void save(GroceryList gl)
	{
		gd.save(gl);
	}
	
	public void update(GroceryList gl)
	{
		gd.save(gl);
	}
	
	public void delete (GroceryList gl)
	{
		gd.delete(gl);
	}
	
	
}
