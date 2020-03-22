package com.project.ipsc.Service;

import com.project.ipsc.Model.Shooter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ShooterService {
    public Page<Shooter> findAll(Pageable pageable);

    public Shooter add (Shooter shooter);

    public Shooter update (Shooter shooter);

    public void DeleteById (Integer shooterId);

}
