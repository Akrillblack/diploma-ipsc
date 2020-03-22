package com.project.ipsc.Dao;

import com.project.ipsc.Model.Stage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StageDao extends JpaRepository<Stage, Integer> {
}
