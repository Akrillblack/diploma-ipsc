package com.project.ipsc.Controller;

import com.project.ipsc.Service.StageService;
import com.project.ipsc.Model.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping(value = "/stages", produces = MediaType.APPLICATION_JSON_VALUE)
public class StageController {
    @Autowired
    private StageService stageService;

    @GetMapping(value = "/stage")
    public final String goToStageAddPage(Model model) {
       Stage stage = new Stage();
       // model.addAttribute("isNew", true);
        model.addAttribute("stage", stage);
        return "stage";
    }

    @GetMapping("/stages")
    public String findAll(Model model){
        model.addAttribute("stages", stageService.findAll());
        return "stages";
    }

    @GetMapping("/stage/{stageNumber}")
    @ResponseStatus(value = HttpStatus.OK)
    public final String findById(@PathVariable Integer stageNumber, Model model){
        model.addAttribute("stage", stageService.findById(stageNumber));
        return "stage";
    }

    @PostMapping(value = "/stage")
    public String add(Stage stage) {
            stageService.add(stage);
            return "redirect:/stages";
    }

    @PostMapping (value = "/stage/{stageNumber}")
    public String update (Stage stage){
            stageService.update(stage);
            return "redirect:/stages";
    }

    @GetMapping(value = "stages/{stageNumber}/delete")
    public final String deleteById(@PathVariable("stageNumber") Integer stageNumber) {
        stageService.deleteById(stageNumber);
        return "redirect:/stages";
    }


}
