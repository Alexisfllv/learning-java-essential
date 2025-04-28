package model;


import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {


    private String name;
    private Double price;

}
