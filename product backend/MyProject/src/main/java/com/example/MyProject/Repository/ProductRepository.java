package com.example.MyProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.MyProject.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
