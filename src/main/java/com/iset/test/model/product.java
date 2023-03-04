package com.iset.test.model;


import javax.persistence.*;
import java.util.*;
@Entity
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long product_id;
   // @Column(name = "product_title")
    private String title;
 //   @Column(name = "product_price")
    private double price;
   // @Column(name = "product_photo")
    private String photo;

    //@ManyToOne
  //  @JoinColumn(name = "category_id")
  //  private category category;

  //  @ManyToOne
  //  @JoinColumn(name = "products")
  //  private catalog catalog;

  // @ManyToOne
  // @JoinColumn(name = "vendor_id")
  //  private vendor vendor;

   // @OneToMany(mappedBy = "product")
    //private List<orderLines> orderLines;

    public product() {}
    public product(String title, float price, String photo) {
        this.title = title;
        this.price = price;
        this.photo = photo;
    }

    public Long getProduct_id() {return  product_id;}
    public void setId(Long product_id){this.product_id=product_id;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {return price;}
    public void setPrice(float price) {
        this.price = price;
    }
    public String getPhoto() {return photo;}
    public void setPhoto(String photo) {this.photo = photo;}
}
