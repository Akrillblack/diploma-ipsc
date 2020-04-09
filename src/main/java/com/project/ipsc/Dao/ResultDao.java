package com.project.ipsc.Dao;

import com.project.ipsc.Model.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ResultDao extends JpaRepository<Result, Integer> {
    List<Result> findResultByResult_categoryAndResultClass(
           String category, String shooterClass);
}
