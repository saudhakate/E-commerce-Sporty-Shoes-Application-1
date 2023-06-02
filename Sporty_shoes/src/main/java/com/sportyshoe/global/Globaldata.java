package com.sportyshoe.global;

import java.util.ArrayList;
import java.util.List;

import com.sportyshoe.model.Product;

public class Globaldata {
	
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}

}