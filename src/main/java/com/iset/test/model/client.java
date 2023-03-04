package com.iset.test.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "client")
public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;
    private String first_name;
    private String last_name;
    private String username;
    private String password;
    private String address;
    private String phone_number;


    public client() {}

    public client(String username,String password) {
        this.username = username;
        this.password = password;
    }
    public client(String first_name, String last_name, String username, String password, String address, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone_number = phone_number;
    }
    public Long getClient_id() {
        return clientId;
    }
    public void setClient_id(Long id) {
        this.clientId = id;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String name) {
        this.first_name = name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

   // public List<order> getOrders() {
     //   return orders;
    //}
   // public void setOrders(List<order> orders) {this.orders = orders;}

    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
