package com.project.ipsc.Controller;

import com.project.ipsc.Model.Shooter;
import com.project.ipsc.Service.ShooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

@Controller
//@RequestMapping(value = "/shooters", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShooterController {

    @Autowired
    private ShooterService shooterService;

    @GetMapping(value = "/addShooter/{shooterId}")
    @ResponseStatus(value = HttpStatus.OK)
    public final String findById(@PathVariable Integer shooterId, Model model) {
        model.addAttribute("shooter", shooterService.findById(shooterId));
        return "addShooter";
    }

    @GetMapping("/shooters")
    public String findAll(Model model){
        //Page<Shooter> shooters = shooterService.findAll();
        model.addAttribute("shooters", shooterService.findAll());
        return "shooters";
    }

    @GetMapping(value = "/addShooter")
    public final String goToShooterAddPage(Model model) {
        Shooter shooter = new Shooter();
        //model.addAttribute("isNew", true);
        model.addAttribute("addShooter", shooter);
        return "addShooter";
    }

    @GetMapping(value = "/{shooterId}/delete")
    public final String deleteById(@PathVariable("shooterId") Integer shooterId,
                                   Model model) {
        shooterService.deleteById(shooterId);
        return "redirect:/shooters";
    }




}
