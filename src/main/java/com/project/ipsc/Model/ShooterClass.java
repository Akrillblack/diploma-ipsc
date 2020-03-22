package com.project.ipsc.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shooterClass")
public class ShooterClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shooterClass_id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "class_name", updatable = false, nullable = false, length = 20)
    private String className;

    @OneToMany(mappedBy = "shooterClass")
    private List<Shooter> shooters;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Shooter> getShooters() {
        return shooters;
    }

    public void setShooters(List<Shooter> shooters) {
        this.shooters = shooters;
    }
}
