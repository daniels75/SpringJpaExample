package com.spr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spr.model.Employee;
import com.spr.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

	
	@Query("select s from shops s where s.name = ?1")
	Shop findShopByName(final String name);
	
	@Query("select s from shops s")
	List<Shop> findAllShops();
	
	@Query("select e from employee e")
	List<Employee> findAllEmployee();
}
