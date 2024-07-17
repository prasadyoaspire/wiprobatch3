package com.abc.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
