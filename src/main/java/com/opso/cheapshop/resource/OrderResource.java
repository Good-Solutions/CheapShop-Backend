package com.opso.cheapshop.resource;

import java.sql.Timestamp;

import com.opso.cheapshop.domain.model.Product;
import com.opso.cheapshop.domain.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderResource {

    private Long id;
    private Timestamp purchase_date;
    private String delivery_address;
    private String delivery_date;
    private int quantity;
    
    private Long userId;
    private Long productId;

}