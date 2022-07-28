package pl.coderslab.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {
    @GetMapping("/setcookie/{value1}/{value2}")
    @ResponseBody
    public String setcookie(@PathVariable String value1, @PathVariable String value2, HttpServletResponse httpServletResponse) {
        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie1.setPath("/");
        cookie2.setPath("/");
        httpServletResponse.addCookie(cookie1);
        httpServletResponse.addCookie(cookie2);
        return "Cookies set";
    }
}
