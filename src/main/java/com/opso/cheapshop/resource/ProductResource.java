package com.opso.cheapshop.resource;

import com.opso.cheapshop.domain.model.AuditModel;
import com.opso.cheapshop.domain.model.Category;
import com.opso.cheapshop.domain.model.Supplier;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResource extends AuditModel {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String url_image;
    private int vote_counter;
    private int minimum_to_sold;
  
    
    private Long categoryId;
    
    
    private Long supplierId;
    /*
    private boolean alreadySold;
    */
    
    
}