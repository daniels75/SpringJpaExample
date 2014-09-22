package com.spr.service;

import java.util.List;

import com.spr.exception.ShopNotFound;
import com.spr.model.Employee;
import com.spr.model.Shop;

public interface ShopService {
	
	Shop create(Shop shop);
	Shop delete(int id) throws ShopNotFound;
	List<Shop> findAll();
	Shop update(Shop shop) throws ShopNotFound;
	Shop findById(int id);
	
	List<Shop> findAllShops();
	Shop findShopByName(final String name);
	
	List<Employee> findAllEmployees();
}
