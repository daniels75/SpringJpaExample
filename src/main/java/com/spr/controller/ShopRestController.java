package com.spr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	public String findShopByName() {
		return shopService.findShopByName("test").toString();
	}
}
