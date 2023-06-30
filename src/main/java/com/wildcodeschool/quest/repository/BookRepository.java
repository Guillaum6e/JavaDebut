package com.wildcodeschool.quest.repository;

import com.wildcodeschool.quest.entity.Book;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByTitleContaining(String text);
}
