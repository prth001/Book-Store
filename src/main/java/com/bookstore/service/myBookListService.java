package com.bookstore.service;


import com.bookstore.entity.MyBookList;
import com.bookstore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class myBookListService {

    @Autowired
   private MyBookRepository mybook;

    public void saveMyBooks(MyBookList book){

        mybook.save(book);

    }

    public List<MyBookList> getAllMyBooks(){
        return mybook.findAll();
    }
   public void deleteById(Integer id){
        mybook.deleteById(id);
   }

}
