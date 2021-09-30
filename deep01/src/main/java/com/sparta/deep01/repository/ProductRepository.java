package com.sparta.deep01.repository;

import com.sparta.deep01.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }