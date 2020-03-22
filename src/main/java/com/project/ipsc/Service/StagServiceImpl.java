package com.project.ipsc.Service;

import com.project.ipsc.Dao.StageDao;
import com.project.ipsc.Model.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class StagServiceImpl implements StageService{
    @Autowired
    private StageDao stageDao;

    @Override
    public Page<Stage> findAll(Pageable pageable) {
        return stageDao.findAll(pageable);
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
