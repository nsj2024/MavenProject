package com.iiht.RestJpa.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.RestJpa.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
