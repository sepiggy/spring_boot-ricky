package cn.sepiggy.springboot.thymeleaf;

import cn.sepiggy.springboot.thymeleaf.model.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class PostController {

    @RequestMapping("/posts/{id}")
    public String index(@PathVariable("id") long id, Model model) {
        model.addAttribute("post", Data.getById(id));
        return "post";
    }

    public static void main(String[] args) {
        SpringApplication.run(PostController.class, args);
    }

}
