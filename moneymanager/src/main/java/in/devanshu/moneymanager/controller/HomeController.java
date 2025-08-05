package in.devanshu.moneymanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping({"/api/v1.0/status", "/api/v1.0/health"})
public class HomeController {

    @GetMapping
    public String healthCheck(){
        return "Application is running...";
    }
}
