package com.grocerylist.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grocerylist.model.GroceryItem;

@Repository
@Transactional
public interface GroceryItemDao extends CrudRepository<GroceryItem, Integer>{

}
