package com.project.ipsc.Service;

import com.project.ipsc.Model.Stage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StageService {
    public List<Stage> findAll();

    public Stage findById (Integer stageNumber);

    public Stage add (Stage stage);

    public Stage update (Stage stage);

    public void deleteById (Integer stageNumber);
}
