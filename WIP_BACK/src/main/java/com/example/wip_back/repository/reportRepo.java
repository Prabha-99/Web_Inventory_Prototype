package com.example.wip_back.repository;

import com.example.wip_back.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface reportRepo extends JpaRepository<Report,Integer> {
}
