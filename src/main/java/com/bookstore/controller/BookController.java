package com.bookstore.controller;

import com.bookstore.entity.Book;
import com.bookstore.entity.MyBookList;
import com.bookstore.service.BookService;
import com.bookstore.service.myBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;


@Controller
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private myBookListService myBookService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getALlBooks() {
        List<Book> list=service.getAllbooks();
//        ModelAndView m=new ModelAndView();
//        m.setViewName("bookList");
//        m.addObject("book",list);
        return new ModelAndView("bookList","book",list) ;
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        service.save(b);
        return "redirect:/available_books";
    }

    @GetMapping("/my_books")
    public String myBooks(){
        return "myBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") Integer id){
        Book b=service.getBookById(id);
        MyBookList mb=new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookService.saveMyBooks(mb);
        return "redirect:/my_books";
    }



}








