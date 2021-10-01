package com.sparta.deep02.repository;

import com.sparta.deep02.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }