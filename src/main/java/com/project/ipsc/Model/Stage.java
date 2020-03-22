package com.project.ipsc.Model;
import javax.persistence.*;

@Entity
@Table(name = "stage")
public class Stage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stage_number", updatable = false, nullable = false)
    private Integer stageNumber;

    @Column(name = "targets", updatable = false, nullable = false)
    private Integer targetsQnt;

    //организация связи со стрелком? many to many
}
