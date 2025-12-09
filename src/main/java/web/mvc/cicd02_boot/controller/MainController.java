package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){
        return "GitHub Actions을 이용한 second CI/CD 25-12-09 오전 test -> docker test2";
    }
}
