package com.bookstore.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="myBooks")
public class MyBookList {

    @Id
    private Integer id;
    private String name;
    private String author;
    private String price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    public MyBookList(Integer id, String author, String name, String price) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
    }
    public MyBookList(){

    }





}
