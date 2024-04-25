package com.app.Repository;

import java.awt.print.Pageable;
import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.Model.Product;

public interface ProductRepo extends MongoRepository<Product, Serializable>{

	

	Optional<Product> findById(Integer productId);

	Product save(Product product);

	void deleteById(Integer id);

	Page<Product> findAll(Pageable pageable);

	Page<Product> findAllById(Pageable pageable);

}
