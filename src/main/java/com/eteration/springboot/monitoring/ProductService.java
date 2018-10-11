package com.eteration.springboot.monitoring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private  ProductRepository productRepository;
	
	
	
	public Collection<Product> listProducts(){
		return productRepository.findAll();
	}
	

}