package com.project.ipsc.Controller;

import com.project.ipsc.Model.Shooter;
import com.project.ipsc.Service.ShooterService;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping(value = "/shooters", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShooterController {

    @Autowired
    private ShooterService shooterService;

    @GetMapping("/shooters")
    public String findAll(Model model){
       // Page<Shooter> shooters = shooterService.findAll();
        //model.addAttribute("shooter", shooters);
        return "shooters";
    }
}
