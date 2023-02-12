package com.example.wip_back.repository;

import com.example.wip_back.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepo extends JpaRepository<Product,Integer> {
}
