package com.bookstore.service;


import com.bookstore.entity.Book;
import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class BookService {

    @Autowired
   private BookRepository bRepo;

    public void save(Book b){
        bRepo.save(b);

    }
    public List<Book> getAllbooks(){
        return bRepo.findAll();
    }

    public Book getBookById(Integer id){
        return bRepo.findById(id).get();
    }

    public void deleteById(Integer id){
        bRepo.deleteById(id);
    }

}
