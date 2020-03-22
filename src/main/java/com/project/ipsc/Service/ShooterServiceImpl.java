package com.project.ipsc.Service;


import com.project.ipsc.Dao.ShooterDao;
import com.project.ipsc.Model.Shooter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

import javax.transaction.Transactional;

@Service
@Transactional

public class ShooterServiceImpl implements ShooterService{
    @Autowired
    private ShooterDao shooterDao;

    @Override
    public List<Shooter> findAll() {
        return shooterDao.findAll();
    }

    @Override
    public Shooter add(Shooter shooter) {
        return shooterDao.save(shooter);
    }

    @Override
    public Shooter update(Shooter shooter) {
        return shooterDao.save(shooter);
    }

    @Override
    public void DeleteById(Integer shooterId) {
        shooterDao.deleteById(shooterId);

    }
}
