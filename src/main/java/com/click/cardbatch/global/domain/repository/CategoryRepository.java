package com.click.cardbatch.global.domain.repository;

import com.click.cardbatch.global.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
