package com.zensar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.bean.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer>{

}
