package com.project.ipsc.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.project.ipsc.Dao.ShooterDao;
import com.project.ipsc.Model.Category;
import com.project.ipsc.Model.Shooter;
import com.project.ipsc.Model.ShooterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShooterDaoTest {
    public static final Integer SHOOTER_ID_1 = 1;

    @Autowired
    private ShooterDao shooterDao;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void findAll(){
        List<Shooter> shooters = shooterDao.findAll();

        assertNotNull(shooters);
        assertTrue(shooters.size() > 0);
    }


    @Test
    public void add(){
        Shooter addShooter = shooterDao.save(createShooter());

        assertNotNull(addShooter);
    }

    @Test
    public void update(){
        Shooter addShooter = shooterDao.save(createShooter());

        addShooter.setCountry("Test2");
        addShooter.setCity("Test2");
        shooterDao.save(addShooter);

        Shooter updateShooter = shooterDao.findById(addShooter.getShooterId()).get();

        assertEquals(updateShooter.getCountry(), "Test2");
        assertEquals(updateShooter.getCity(), "Test2");
    }

    @Test
    public void deleteById(){
        Shooter addShooter = shooterDao.save(createShooter());
        int sizeBeforeDelete = shooterDao.findAll().size();

        shooterDao.deleteById(addShooter.getShooterId());
        int sizeAfterDelete = shooterDao.findAll().size();

        assertEquals(sizeBeforeDelete - 1, sizeAfterDelete);
        assertTrue(shooterDao.findById(addShooter.getShooterId()).isEmpty());
    }



    public Shooter createShooter(){
        Shooter shooter = new Shooter();
        shooter.setShooterId(1);
        shooter.setName("Test");
        shooter.setSurname("Test");
        shooter.setCountry("Test");
        shooter.setCity("Test");

        Category category = new Category();
        category.setCategoryName("Test");
        shooter.setCategory(category);

        ShooterClass shooterClass = new ShooterClass();
        shooterClass.setClassName("Test");
        shooter.setShooterClass(shooterClass);

        return shooter;
    }

}
