package com.wildcodeschool.quest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wildcodeschool.quest.entity.Book;
import com.wildcodeschool.quest.repository.BookRepository;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRespository;

    @GetMapping("/books")
    public List<Book> index() {
        return (List<Book>) bookRespository.findAll();
    }

    @GetMapping("/books/{id}")
    public Book show(@PathVariable Long id) {
        Optional<Book> optionalBook = bookRespository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    @PostMapping("/books/search")
    public List<Book> search(@RequestBody String text) {
        return bookRespository.findByTitleContaining(text);
    }

    @PostMapping("/books")
    public Book create(@RequestBody Book book) {
        return bookRespository.save(book);
    }

    @PutMapping("/books/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        Book bookToUpdate = bookRespository.findById(id).get();
        bookToUpdate.setTitle(book.getTitle());
        bookToUpdate.setAuthor(book.getAuthor());
        bookToUpdate.setDescription(book.getDescription());
        return bookRespository.save(bookToUpdate);
    }

    @DeleteMapping("books/{id}")
    public boolean delete(@PathVariable Long id) {
        bookRespository.deleteById(id);
        return true;
    }
}
