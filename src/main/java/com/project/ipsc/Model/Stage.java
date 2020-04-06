package com.project.ipsc.Model;
import javax.persistence.*;

@Entity
@Table(name = "stage")
public class Stage {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stage_number", updatable = false, nullable = false)
    private Integer stageNumber;

    @Column(name = "targets", updatable = true, nullable = false)
    private Integer targetsQnt;

    public Integer getStageNumber() {
        return stageNumber;
    }

    public void setStageNumber(Integer stageNumber) {
        this.stageNumber = stageNumber;
    }

    public Integer getTargetsQnt() {
        return targetsQnt;
    }

    public void setTargetsQnt(Integer targetsQnt) {
        this.targetsQnt = targetsQnt;
    }
}
