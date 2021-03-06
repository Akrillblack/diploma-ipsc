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

    @Column(name = "shooter_country", nullable = false, length = 20)
    private String country;

    @Column(name = "shooter_city", nullable = false, length = 20)
    private String city;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "shooterClass_id")
    private ShooterClass shooterClass;

    public Integer getShooterId() {
        return shooterId;
    }

    public void setShooterId(Integer shooterId) {
        this.shooterId = shooterId;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ShooterClass getShooterClass() {
        return shooterClass;
    }

    public void setShooterClass(ShooterClass shooterClass) {
        this.shooterClass = shooterClass;
    }

    @Override
    public String toString() {
        return "Shooter{" +
                "shooterId=" + shooterId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", category=" + category +
                ", shooterClass=" + shooterClass +
                '}';
    }
}
