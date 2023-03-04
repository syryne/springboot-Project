package com.iset.test.model;

import javax.persistence.*;


@Entity
public class catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catalogId;
    private String catalogName;

    public catalog(String name) {
        this.catalogName = name;
    }

    public catalog() {

    }

    public Long getCatalogId() {
        return catalogId;
    }
    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }


    public String getName() {
        return catalogName;
    }

    public void setName(String name) {
        this.catalogName = name;
    }
}
