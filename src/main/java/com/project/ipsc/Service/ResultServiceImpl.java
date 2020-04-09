package com.project.ipsc.Service;

import com.project.ipsc.Model.Result;
import com.project.ipsc.Dao.ResultDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ResultServiceImpl implements ResultService {
    @Autowired ResultDao resultDao;

    @Override
    public List<Result> filterResult(String category, String shooterClass) {
        return resultDao.findResultByResult_categoryAndResultClass(category, shooterClass);
    }

    @Override
    public List<Result> findAll() {
        return resultDao.findAll();
    }
}
