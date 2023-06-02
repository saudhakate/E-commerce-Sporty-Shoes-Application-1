package com.sportyshoe.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sportyshoe.model.Product;
import com.sportyshoe.service.CategoryService;
import com.sportyshoe.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping({"/","/home"})
	public String home()
	{
		return "index";
	}
	
	
	@GetMapping("/shop")
	public String shop(Model model)
	{
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("products", productService.getAllProduct());
		return "shop";
	}
	
	@GetMapping("shop/category/{id}")
	public String shopByCategory(Model model, @PathVariable int id)
	{
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("products", productService.getAllProductByCategoryId(id));
		return "shop";
	}
	
	@GetMapping("/shop/viewproduct/{id}")
	public String viewProduct(Model model,@PathVariable long id)
	{
		//model.addAttribute("products", productService.getProductById(id).get());
		Optional<Product> product = productService.getProductById(id);
		model.addAttribute("product", product.get());
		return "viewProduct";
	}
}
