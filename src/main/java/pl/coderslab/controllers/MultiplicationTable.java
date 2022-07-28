package pl.coderslab.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class MultiplicationTable {
    @GetMapping("/multiply")
    public String multiplicationSize(@RequestParam(defaultValue = "10") int size, Model model) {
        model.addAttribute("size", size);
        return "multiply";
    }
    @GetMapping("/multiply/{rows}/{columns}")
    public String multiplicationRowCols(@PathVariable int rows, @PathVariable int columns, Model model){
        model.addAttribute("rows", rows);
        model.addAttribute("columns", columns);
        return "multiplyRowCols";
    }
}
