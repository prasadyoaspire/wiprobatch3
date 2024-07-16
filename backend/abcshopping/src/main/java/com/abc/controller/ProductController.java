package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dto.ProductDTO;
import com.abc.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/")
	public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
		
		productDTO = productService.saveProduct(productDTO);
		
		return new ResponseEntity<>(productDTO,HttpStatus.CREATED);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<ProductDTO> fetchProductDetails(@PathVariable long productId) {
		
		ProductDTO productDTO = productService.findProductById(productId);
		
		return new ResponseEntity<>(productDTO,HttpStatus.OK);
	}
}
