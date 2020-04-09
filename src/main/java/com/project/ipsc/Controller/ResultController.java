package com.project.ipsc.Controller;

import com.project.ipsc.Service.ResultService;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.HttpClientErrorException;

@Controller
public class ResultController {
    @Autowired
    private ResultService resultService;

    @GetMapping(value = "/results")
    public final String filterResult (@ModelAttribute(value = "category") String category,
                                      @ModelAttribute(value = "shooterClass") String shooterClass,
                                      Model model,
                                      BindingResult result) {
        try {
            if (!result.hasErrors() && category != null && shooterClass != null){
                model.addAttribute("results", resultService.filterResult(category, shooterClass));
            }
            return "results";
        } catch (HttpClientErrorException e){
            return "results";
        }
    }

    @GetMapping("/results")
    public String findAll(Model model){
        model.addAttribute("results", resultService.findAll());
        return "results";
    }


}