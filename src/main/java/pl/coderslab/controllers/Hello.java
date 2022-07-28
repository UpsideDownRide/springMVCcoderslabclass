package pl.coderslab.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class Hello {

    @GetMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String greeter(@PathVariable String firstName, @PathVariable String lastName){
        log.debug("Generating greeting for: {}, {}", firstName, lastName);
        return "Witaj " + firstName + " " + lastName;
    }
}
