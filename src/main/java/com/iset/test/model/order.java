package com.iset.test.model;

import javax.persistence.*;
import  java.util.*;

@Entity
public class order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;
    private Date passedAt;


    public order(Date passedAt) {
        this.passedAt = passedAt;
    }

    public order() {

    }

    public Long getOrder_id() {return order_id;}
    public void setOrder_id(Long order_id) {this.order_id = order_id;}
    public Date getPassedAt() {
        return passedAt;
    }
    public void setPassedAt(Date passedAt) {
        this.passedAt = passedAt;
    }
}
