package com.project.ipsc.Model;

import javax.persistence.*;

//связь с результатами?

@Entity
@Table(name = "points")
public class Points {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "point_id", updatable = false, nullable = false)
    private Integer id;

    @Column(name = "point_name", updatable = false, nullable = false)
    private String pointName;

    @Column(name = "point_value", updatable = false, nullable = false)
    private Integer pointValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public Integer getPointValue() {
        return pointValue;
    }

    public void setPointValue(Integer pointValue) {
        this.pointValue = pointValue;
    }
}
