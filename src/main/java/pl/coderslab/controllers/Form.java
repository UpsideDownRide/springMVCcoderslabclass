package pl.coderslab.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
@RequestMapping("/first")
@Slf4j
public class Form {
    @GetMapping("/form")
    public String returnForm(){
        log.debug("Returning form.jsp");
        return "form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String returnForm(@RequestParam String paramName, @RequestParam String paramDate){
        log.debug("Received paramName: {} & paramDate: {}", paramName, paramDate);
        DateTimeFormatter formDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse(paramDate);
        return "paramName: " + paramName + "\n" + "paramDate: " + paramDate;
    }
}
