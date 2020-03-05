package com.grocerylist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grocerylist.model.GroceryItem;
import com.grocerylist.service.GroceryItemService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/gi")
public class GroceryItemController {

	@Autowired
	GroceryItemService gs;
	
	@GetMapping(value = "/all")
	public List<GroceryItem> getAll()
	{
		return gs.findAll(); 
	}
	
	@PostMapping(value = "/save")
	public void save(@RequestBody GroceryItem gi)
	{
		gs.save(gi);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody int id)
	{
		GroceryItem gi = gs.findById(id);
		gs.delete(gi);
	}
	
	
	
	
}
