package com.abc.service;

import java.util.Optional;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dto.ProductDTO;
import com.abc.entity.Product;
import com.abc.exception.ResourceNotFoundException;
import com.abc.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductDTO saveProduct(ProductDTO product) {
		
		//convert dto to entity
		Product productEntity = modelMapper.map(product, Product.class);		
		
		Product newProduct = productRepository.save(productEntity);
		
		//convert entity to dto
		product = modelMapper.map(newProduct, ProductDTO.class);
		
		return product;
	}

	@Override
	public ProductDTO findProductById(long productId) throws ResourceNotFoundException{
		
		Optional<Product> optionalProduct = productRepository.findById(productId);
		if(optionalProduct.isEmpty()) {
			throw new ResourceNotFoundException("Produt not found with id: "+productId);
		}
		
		Product product = optionalProduct.get();
		
		//convert entity to dto
		ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
	
		return productDTO;
	}

	@Override
	public Set<ProductDTO> findAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
