package com.website.ecommerceclientapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.website.ecommerceclientapp.entity.Products;
@Repository
public interface ProductRepository extends MongoRepository<Products, Integer>{

}
