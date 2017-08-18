package cn.sepiggy.springboot.return_html;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class ReturnHtmlController {
    @RequestMapping("/posts/{id}")
    @ResponseBody
    public String post(@PathVariable("id") int id) {
        return "<html><head><title>Title</title></head><body><h1>This is a Post</h1><p>This is content of the post.</p></body></html>";
    }

    public static void main(String[] args) {
        SpringApplication.run(ReturnHtmlController.class, args);
    }


}
