package com.example.PhamKhacTuan5.repository;

import com.example.PhamKhacTuan5.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
