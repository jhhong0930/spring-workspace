package com.sparta.deep01.product;

import com.sparta.deep01.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }