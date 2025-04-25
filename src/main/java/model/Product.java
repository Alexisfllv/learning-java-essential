package model;


import lombok.*;

@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Product {
    private Integer id;
    private String name;
    private String description;
    private Double price;
}
