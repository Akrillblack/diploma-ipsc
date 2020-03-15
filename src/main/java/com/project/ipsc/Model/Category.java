package com.project.ipsc.Model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id", updatable = false, nullable = false)
    private Integer id;
    @Column(name = "category_name", nullable = false, length = 20)
    private String categoryName;
    @OneToMany(mappedBy = "category")
    private List<Shooter> shooters;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Shooter> getShooters() {
        return shooters;
    }

    public void setShooters(List<Shooter> shooters) {
        this.shooters = shooters;
    }
}
