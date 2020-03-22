package com.project.ipsc.Controller;

import com.project.ipsc.Service.ShooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping(value = "/shooters", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShooterController {

    @Autowired
    private ShooterService shooterService;

    @GetMapping("/shooters")
    public String findAll(Model model){
        //Page<Shooter> shooters = shooterService.findAll();
        model.addAttribute("shooters", shooterService.findAll());
        return "shooters";
    }
}
