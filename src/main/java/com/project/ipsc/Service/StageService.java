package com.project.ipsc.Service;

import com.project.ipsc.Model.Stage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StageService {
    public Page<Stage> findAll(Pageable pageable);

    public Stage add (Stage stage);

    public Stage update (Stage stage);

    public void deleteById (Integer stageNumber);
}
