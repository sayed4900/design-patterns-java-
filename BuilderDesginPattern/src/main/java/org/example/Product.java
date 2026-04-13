package org.example;

import java.math.BigDecimal;

public class Product {

    // may I want to implement constructor to take 1 args or 2 args only or all of them
    // so the builder desgin pattern solve this problem
   //The Builder pattern solves the problem of needing multiple
    // constructor variations (1 arg, 2 args, all args, or any combination in between)
    // without creating a messy explosion of constructors.
    private int id;
    private String name;
    private BigDecimal price;
    private String color;

    public static class Builder{
        private Product product = new Product();

        public Builder id(int id){
            product.id = id;
            return this; // this here refers to the current instance of Builder
        }

        public Builder name(String name){
            product.name= name;
            return this;
        }

        public Builder price(BigDecimal price){
            product.price = price;
            return this;
        }

        public Builder color(String color){
            product.color = color;
            return this;
        }

        public Product build(){
            return product;
        }

    }

    public static Builder builder(){ // lombok
        return new Builder();
    }

}
