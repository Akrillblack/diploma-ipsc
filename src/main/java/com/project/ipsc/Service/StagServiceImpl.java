package com.project.ipsc.Service;

import com.project.ipsc.Dao.StageDao;
import com.project.ipsc.Model.Shooter;
import com.project.ipsc.Model.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StagServiceImpl implements StageService{
    @Autowired
    private StageDao stageDao;

    @Override
    public List<Stage> findAll( ) {
        return stageDao.findAll();
    }

    @Override
    public Stage findById(Integer stageNumber) {
        return stageDao.findById(stageNumber)
                .orElseThrow(() -> new RuntimeException("Stage not found"));
    }

    @Override
    public Stage add(Stage stage) {
        return stageDao.save(stage);
    }

    @Override
    public Stage update(Stage stage) {
        return stageDao.save(stage);
    }

    @Override
    public void deleteById(Integer stageNumber) {
        stageDao.deleteById(stageNumber);
    }
}
