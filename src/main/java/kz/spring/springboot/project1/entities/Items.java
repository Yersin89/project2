package kz.spring.springboot.project1.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Items {
    private Long id;
    private String name;
    private String description;
    private double price;
}
