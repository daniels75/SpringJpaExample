package com.spr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spr.model.Shop;
import com.spr.service.ShopService;

@RestController
@RequestMapping("/data")
public class ShopRestController {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public String findAll() {
		return shopService.findAll().toString();
	}
	
	@RequestMapping(value = "/allShops", method = RequestMethod.GET)
	public String findAllShops() {
		return shopService.findAllShops().toString();
	}
	
	@RequestMapping(value = "/shopByName", method = RequestMethod.GET)
	public String findShopByName(@RequestParam(value = "name", required = true) final String name) {
		final Shop shop = shopService.findShopByName(name);
		return shop != null ? shop.toString() : "";
	}
	
	@RequestMapping(value = "/allEmployees", method = RequestMethod.GET)
	public String findAllEmployees() {
		return shopService.findAllEmployees().toString();
	}
	
	@RequestMapping(value = "/shopByEmployee", method = RequestMethod.GET)
	public String findShopByEmployeeName(@RequestParam(value = "name", required = true) final String name) {
		final Shop shop = shopService.findShopByEmployeeName(name);
		return shop != null ? shop.toString() : "";
	}
	
}
