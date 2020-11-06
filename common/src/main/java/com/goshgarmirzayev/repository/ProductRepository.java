package com.goshgarmirzayev.repository;

import com.goshgarmirzayev.entity.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
