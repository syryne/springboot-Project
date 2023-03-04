package com.iset.test.model;

import javax.persistence.*;


@Entity
public class category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;
    private String categoryName;


    public category() {}

    public category(String name) {
        this.categoryName = name;
    }

    public Long getCategory_id() {
        return categoryId;
    }

    public void setCategory_id(Long id) {this.categoryId = id;}

    public String getName() {
        return categoryName;
    }
    public void setName(String name) {
        this.categoryName = name;
    }


}
