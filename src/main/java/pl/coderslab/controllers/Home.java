package pl.coderslab.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class Home {

    @GetMapping("/")
    public String hello() {
        log.debug("Returning index");
        return "index";
    }

}
