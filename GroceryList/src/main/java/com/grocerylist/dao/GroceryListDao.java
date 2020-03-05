package com.grocerylist.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.grocerylist.model.GroceryList;

@Repository
@Transactional
public interface GroceryListDao extends CrudRepository<GroceryList, Integer> {

}
