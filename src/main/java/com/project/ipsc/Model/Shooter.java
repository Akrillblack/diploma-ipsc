package com.project.ipsc.Model;

import javax.persistence.*;

@Entity
@Table(name = "shooter")
public class Shooter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shooter_id", updatable = false, nullable = false)
    private Integer shooterId;

    @Column(name = "shooter_name", nullable = false, length = 20)
    private String name;

    @Column(name = "shooter_surname", nullable = false, length = 20)
    private String surname;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public int getShooterId() {
        return shooterId;
    }

    public void setShooterId(int id) {
        this.shooterId = id;
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
