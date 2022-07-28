package pl.coderslab.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Random;

@Controller
@Slf4j
public class ShowRandom {

    @GetMapping(value = "/show-random", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String showRandom() {
        Random random = new Random();
        log.debug("Generating number");
        int randomNumber = random.nextInt(100) + 1;
        return "Wylosowano liczbę: " + randomNumber;
    }

    @GetMapping(value = "/show-random/{minBound}/{maxBound}", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String showRandomMinMax(@PathVariable int maxBound, @PathVariable int minBound) {
        Random random = new Random();
        log.debug("Generating number with bounds: {}, {}", maxBound, minBound);
        int randomNumber = random.nextInt(maxBound - minBound + 1) + minBound;
        log.debug("Generated: {}", randomNumber);
        return "Wylosowano liczbę: " + randomNumber;
    }
}
