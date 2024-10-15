package com.sts.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sts.binding.Product;
@RestController
public class ProductRestController {
	
	
@GetMapping("/pex/{id}")
	public ResponseEntity<Product>getProduct(@PathVariable("id")Integer id ) throws Exception{
		
	if(id==1) {
		
		Product p =new Product();;
		p.setId(1);
		p.setName("SSD");
		p.setPrice(4333.00);
		return new ResponseEntity<>(p, HttpStatus.OK);	
	}else
	{
		throw new Exception("Invalid Id");
	}
		
	}
}
