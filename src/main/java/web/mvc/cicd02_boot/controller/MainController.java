package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){
        return "GitHub Actions에서 build하고 SCP로 EC2에 빌드파일 전송하기 test입니다.";
    }
}
