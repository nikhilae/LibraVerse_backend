package com.libraverse.repository;


import com.libraverse.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


   // @Modifying
   // @Transactional
    @Query(value="select * from book where title like %?1%",nativeQuery = true)
    List<Book> findByName(String title);

}
