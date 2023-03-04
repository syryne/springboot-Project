package com.iset.test.model;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class orderLines {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        private Long orderLines_id;
       // @Column(name = "product_quantity")

        private Integer quantity;
      // @Column(name = "order_date")
        private LocalDate orderDate;

      //  @ManyToOne
     //   @JoinColumn(name = "order_id")
     //   private order order;

      //  @ManyToOne
     //   @JoinColumn(name = "product_id")
      //  private product product;

        public orderLines(LocalDate orderDate) {this.orderDate = orderDate;}
        public orderLines() {}

        public void setCommandLine_id(Long commandLine_id) {this.orderLines_id = commandLine_id;}
        public Long getCommandLine_id() {return orderLines_id;}
        public LocalDate getOrderDate() {return orderDate;}
        public void setOrderDate(LocalDate orderDate) {this.orderDate = orderDate;}
        public Integer getQuantity() {return quantity;}
        public void setQuantity(Integer quantity) {this.quantity = quantity;}
    }


