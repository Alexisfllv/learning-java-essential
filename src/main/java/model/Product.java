package model;


import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @ToString.Include
    @EqualsAndHashCode.Include
    private Integer id;
    private String name;
    private String description;
    private Double price;
}
