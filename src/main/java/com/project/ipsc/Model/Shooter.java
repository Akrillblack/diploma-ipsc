package com.project.ipsc.Model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "shooter")
public class Shooter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shooter_id", updatable = false, nullable = false)
    private Integer id;
    @Column(name = "shooter_name", nullable = false, length = 20)
    private String name;
    @Column(name = "shooter_surname", nullable = false, length = 20)
    private String surname;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
