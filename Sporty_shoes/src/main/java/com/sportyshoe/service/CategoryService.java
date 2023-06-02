package com.sportyshoe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoe.model.Category;
import com.sportyshoe.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public void addCategory(Category Category)
	{
		categoryRepository.save(Category);
	}
	
	public Optional<Category> getCategoryById(int id)
	{
		return categoryRepository.findById(id);
	}
	
	public List<Category> getAllCategory()
	{
		return categoryRepository.findAll();
	}
	
	public  void removeCategoryById(int id)
	{
		categoryRepository.deleteById(id);
	}
}
