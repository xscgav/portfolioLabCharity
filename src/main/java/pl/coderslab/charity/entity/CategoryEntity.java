package pl.coderslab.charity.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}
