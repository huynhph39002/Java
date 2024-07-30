package com.example.demo.repository;


import com.example.demo.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepos extends JpaRepository<Category,Long> {
    //C1: Query creation
    //Category findCategoryByIdAndCategoryCode(Long id,String code);

    //C2: Raw SQL
      //C2.1: truy van thuc the JPQL - JPA Query Language
            // @Query("select  c FROM Category c WHERE c.id=?1 AND c.categoryCode=?2")
            // List<Category> search(Long id, String code);
      //C2.2: truy van SQL : native query
            // @Query(value = "select * from category where  id=?1 and  category_code=?2 ,nativeQuery=true")
            // List<Category> search(Long id, String code);

}
