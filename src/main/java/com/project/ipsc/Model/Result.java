package com.project.ipsc.Model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;

@Entity
@Table(name = "result")
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "result_id", updatable = false, nullable = false)
    private Integer result_shooterId;

    @Column(name = "shooter_result_name", nullable = false, length = 20)
    private String result_name;

    @Column(name = "shooter_result_surname", nullable = false, length = 20)
    private String result_surname;

    @Column(name = "shooter_result_class", nullable = false, length = 20)
    private String resultClass;

    @Column(name = "shooter_result_category", nullable = false, length = 20)
    private String result_category;

    @Column(name = "shoter_result_points", nullable = false, length = 20)
    private String result_points;

    @Column(name = "shoter_result_time", nullable = false, length = 20)
    private String result_time;

    @Column(name = "shoter_result_hitfactor", nullable = false, length = 20)
    private String result_hitfactor;

    public Integer getResult_shooterId() {
        return result_shooterId;
    }

    public void setResult_shooterId(Integer result_shooterId) {
        this.result_shooterId = result_shooterId;
    }

    public String getResult_name() {
        return result_name;
    }

    public void setResult_name(String result_name) {
        this.result_name = result_name;
    }

    public String getResult_surname() {
        return result_surname;
    }

    public void setResult_surname(String result_surname) {
        this.result_surname = result_surname;
    }

    public String getResultClass() {
        return resultClass;
    }

    public void setResultClass(String resultClass) {
        this.resultClass = resultClass;
    }

    public String getResult_category() {
        return result_category;
    }

    public void setResult_category(String result_category) {
        this.result_category = result_category;
    }

    public String getResult_points() {
        return result_points;
    }

    public void setResult_points(String result_points) {
        this.result_points = result_points;
    }

    public String getResult_time() {
        return result_time;
    }

    public void setResult_time(String result_time) {
        this.result_time = result_time;
    }

    public String getResult_hitfactor() {
        return result_hitfactor;
    }

    public void setResult_hitfactor(String result_hitfactor) {
        this.result_hitfactor = result_hitfactor;
    }
}
