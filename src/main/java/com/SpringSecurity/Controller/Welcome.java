package com.SpringSecurity.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {

    @GetMapping("/")
    public String hello() {
        return "welcome to spring security";
    }

    @GetMapping("/csrf")
    public CsrfToken getToken(HttpServletRequest httpServletRequest) {
        return (CsrfToken) httpServletRequest.getAttribute("_csrf");
    }
}