package com.project.ipsc.Service;

import com.project.ipsc.Model.Shooter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ShooterService {
    public List<Shooter> findAll();

    public Shooter findById(Integer shooterId);

    public Shooter add (Shooter shooter);

    public Shooter update (Shooter shooter);

    public void deleteById (Integer shooterId);

}
