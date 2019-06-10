package com.kodilla.ecommercee.domain;

import com.kodilla.ecommercee.GenericEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class Group extends GenericEntity {

    @Id
    @GeneratedValue
    @NotNull
    @Column(unique = true)
    private Long id;

    private String name;

    @OneToMany(targetEntity = Product.class, mappedBy = "group", fetch=FetchType.LAZY)
    private List<Product> products = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }
}
