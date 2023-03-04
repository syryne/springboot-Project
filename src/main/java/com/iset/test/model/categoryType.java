package com.iset.test.model;

import javax.persistence.*;
@Entity
public class categoryType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryTypeId;
    private String categoryTypeName;
    public categoryType() {}
    public categoryType(String name) {
        this.categoryTypeName = name;
    }
    public Long getCategoryType_id() {
        return categoryTypeId;
    }
    public void setCategoryType_id(Long id) {
        this.categoryTypeId = id;
    }
    public String getName() {return categoryTypeName;
    }
    public void setName(String name) {
        this.categoryTypeName = name;
    }

}
