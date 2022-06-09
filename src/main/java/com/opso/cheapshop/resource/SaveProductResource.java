package com.opso.cheapshop.resource;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.opso.cheapshop.domain.model.Category;
import com.opso.cheapshop.domain.model.Supplier;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveProductResource {

    @NotNull
    @NotBlank
    @Size(max=75)
    private String name;

    @NotNull
    private Double price;

    @NotNull
    @NotBlank
    @Size(max=300)
    private String description;

    @Min(1)
    @NotNull
    private int minimumToSold;
        
    @NotNull
    @NotBlank
    @Size(max=300)
    private String url_image;
     
    @Min(1)
    @NotNull
    private int voteCounter;
    
    @NotNull
    private boolean alreadySold;
     
    @NotNull
    private Category category_id;
    
    @NotNull
    private Supplier supplier_id;
    /*
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String url_image;
    private int voteCounter;
    private int minimumToSold;
*/
}
