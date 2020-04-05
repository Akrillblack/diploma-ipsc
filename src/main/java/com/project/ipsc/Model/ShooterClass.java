package com.project.ipsc.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shooter_class")
public class ShooterClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shooter_class_id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "class_name", updatable = false, nullable = false, length = 20)
    private String className;

    @OneToMany(mappedBy = "shooterClass", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
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

    @Override
    public String toString() {
        return "ShooterClass{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", shooters=" + shooters +
                '}';
    }
}
