package cn.sepiggy.springboot.thymeleaf;

import cn.sepiggy.springboot.thymeleaf.model.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", Data.posts);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(IndexController.class, args);
    }
}
