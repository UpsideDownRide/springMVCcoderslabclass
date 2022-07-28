package pl.coderslab.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
@Slf4j
public class Hello {

    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String greeter(@PathVariable String firstName, @PathVariable String lastName){
        log.debug("Generating greeting for: {}, {}", firstName, lastName);
        return "Witaj " + firstName + " " + lastName;
    }

    @GetMapping("/helloView")
    public String hellowView(Model model){
        int hour = LocalDateTime.now().getHour();
        String color = hour > 8 && hour < 20 ? "black" : "white";
        String backgroundColor = hour > 8 && hour < 20 ? "white" : "black";
        model.addAttribute("color", color);
        model.addAttribute("backgroundColor", backgroundColor);
        return "helloView";
    }
}
