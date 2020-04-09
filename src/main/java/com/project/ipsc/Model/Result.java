package com.project.ipsc.Model;

import javax.persistence.*;

@Entity
@Table(name = "result")
public class Result {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "result_id", updatable = false, nullable = false)
    private Integer resultId;

    @Column(name = "shooter_result_name", nullable = false, length = 20)
    private String resultName;

    @Column(name = "shooter_result_surname", nullable = false, length = 20)
    private String resultSurname;

    @Column(name = "shooter_result_class", nullable = false, length = 20)
    private String resultClass;

    @Column(name = "shooter_result_category", nullable = false, length = 20)
    private String category;

    @Column(name = "shoter_result_points", nullable = false, length = 20)
    private String resultPoints;

    @Column(name = "shoter_result_time", nullable = false, length = 20)
    private String resultTime;

    @Column(name = "shoter_result_hitfactor", nullable = false, length = 20)
    private String resultHitfactor;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getResultSurname() {
        return resultSurname;
    }

    public void setResultSurname(String resultSurname) {
        this.resultSurname = resultSurname;
    }

    public String getResultClass() {
        return resultClass;
    }

    public void setResultClass(String resultClass) {
        this.resultClass = resultClass;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String resultСategory) {
        this.category = resultСategory;
    }

    public String getResultPoints() {
        return resultPoints;
    }

    public void setResultPoints(String resultPoints) {
        this.resultPoints = resultPoints;
    }

    public String getResultTime() {
        return resultTime;
    }

    public void setResultTime(String resultTime) {
        this.resultTime = resultTime;
    }

    public String getResultHitfactor() {
        return resultHitfactor;
    }

    public void setResultHitfactor(String resultHitfactor) {
        this.resultHitfactor = resultHitfactor;
    }
}
