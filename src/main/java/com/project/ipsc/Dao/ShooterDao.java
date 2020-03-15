package com.project.ipsc.Dao;

import com.project.ipsc.Model.Shooter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShooterDao extends JpaRepository<Shooter, Integer> {

}
