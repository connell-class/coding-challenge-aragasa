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

import com.grocerylist.model.GroceryList;
import com.grocerylist.service.GroceryListService;

@RestController
@RequestMapping(value = "/grocerylist")
@CrossOrigin(origins = "*")
public class GroceryListController {
	
	@Autowired
	GroceryListService gs;

	@GetMapping(value = "/getone")
	public GroceryList getById(@RequestBody int id)
	{
		return gs.findById(id);
	}
	
	@GetMapping(value = "/all")
	public List<GroceryList> getAll()
	{
		return gs.findAll();
	}
	
	@PostMapping(value = "/save")
	public void save(@RequestBody GroceryList gl)
	{
		gs.save(gl);
	}
	
	@DeleteMapping(value = "/delete")
	public void delete(@RequestBody int id)
	{
		GroceryList gl = gs.findById(id);
		gs.delete(gl);
	}
	
	@PostMapping(value = "/add")
	public void add(@RequestBody GroceryList gl)
	{
		gs.update(gl);
	}
	
	
}
