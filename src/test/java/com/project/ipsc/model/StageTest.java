package com.project.ipsc.model;

import com.project.ipsc.Model.Stage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StageTest {
    private static final Integer STAGE_ID = 11;
    private static final Integer TARGETS = 5;

    Stage stage = new Stage();

    @Test
    public void getStageId(){
        stage.setStageNumber(STAGE_ID);
        assertTrue(stage.getStageNumber().equals(STAGE_ID));
    }

    @Test
    public void getTargets(){
        stage.setTargetsQnt(TARGETS);
        assertTrue(stage.getTargetsQnt().equals(TARGETS));
    }

    @Test
    public void testToString(){
        stage.setStageNumber(STAGE_ID);
        stage.setTargetsQnt(TARGETS);

        String expectedResponseStage = "Stage{" +
                "stageNumber=" + stage.getStageNumber() +
                ", targetsQnt=" + stage.getTargetsQnt() +
                '}';

        assertEquals(expectedResponseStage, stage.toString());
    }

}
