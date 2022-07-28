package pl.coderslab.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Controller
@Slf4j
public class FreeTime {

    @GetMapping(value = "/free-time", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String freeTime(){
        LocalDateTime dateTime = LocalDateTime.now();
        var dayOfWeek = dateTime.getDayOfWeek();
        var currentTime = dateTime.getHour();
        log.debug("Generating response");
        if (dayOfWeek == DayOfWeek.SUNDAY || dayOfWeek == DayOfWeek.SATURDAY) {
            return "Wolne";
        } else {
            if (currentTime > 9 && currentTime < 17) {
                return "Pracuję, nie dzwoń";
            } else {
                return "Po pracy";
            }
        }
    }
}
