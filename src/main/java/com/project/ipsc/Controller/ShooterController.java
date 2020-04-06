package com.project.ipsc.Controller;

import com.project.ipsc.Model.Shooter;
import com.project.ipsc.Service.ShooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("shooters", shooterService.findAll());
        return "shooters";
    }

    @GetMapping(value = "/addShooter")
    public final String goToShooterAddPage(Model model) {
        Shooter shooter = new Shooter();
        model.addAttribute("isNew", true);
        model.addAttribute("shooter", shooter); //!!!
        return "addShooter";
    }

    @PostMapping(value = "/addShooter")
    public String add (Shooter shooter){
            shooterService.add(shooter);//!!!
            return "redirect:/shooters";

    }

    @PostMapping (value = "/addShooter/{shooterId}")
    public String update (Shooter shooter){
        shooterService.update(shooter);
        return "redirect:/shooters";
    }

    @GetMapping(value = "shooters/{shooterId}/delete")
    public final String deleteById(@PathVariable("shooterId") Integer shooterId) {
        shooterService.deleteById(shooterId);
        return "redirect:/shooters";
    }

}
