package vttp2023.batch3.assessment.paf.bookings.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {


    @GetMapping("/")
    public String search() {
        return "search";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/detail")
    public String detail() {
        return "detail";
    }


}
