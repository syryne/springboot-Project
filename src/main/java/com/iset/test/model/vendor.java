package com.iset.test.model;

import javax.persistence.*;
import java.util.*;
@Entity
public class vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendor_id;
    @Column (name = "vendor_name")
    private  String name;
    @Column (name = "vendor_phone")
    private String phone_number;
    private String vendor_mail;
  //  @OneToMany(mappedBy = "vendor")
  //  private List<product> products;
    public vendor() {}
    public vendor(String name, String phone_number, String vendor_mail) {
        this.name = name;
        this.phone_number = phone_number;
        this.vendor_mail = getVendor_mail();
     //   this.products = products;
    }

    public Long getVendor_id() {
        return vendor_id;
    }
    public void setVendor_id(Long vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    //public List<product> getProducts() {
     //   return products;
   // }

   // public void setProducts(List<product> products) {this.products = products;}

    public String getVendor_mail() {
        return vendor_mail;
    }

    public void setVendor_mail(String vendor_mail) {
        this.vendor_mail= vendor_mail;
    }
}
