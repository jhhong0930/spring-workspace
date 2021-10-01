package com.sparta.deep02.repository;

import com.sparta.deep02.domain.Product;
import com.sparta.deep02.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUserId(Long userId);
}