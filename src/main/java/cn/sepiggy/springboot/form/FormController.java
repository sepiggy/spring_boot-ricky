package cn.sepiggy.springboot.form;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class FormController {

    // 输入新文章信息的页面
    @RequestMapping(value = "/posts/create", method = RequestMethod.GET)
    public String createPage() {
        return "create";
    }

    // 处理表单数据
    @RequestMapping(value = "/posts", method = RequestMethod.POST)
    @ResponseBody
    public String create(@RequestParam("title") String title, @RequestParam("content") String content) {
        System.out.println("title:" + title);
        System.out.println("content:" + content);
        return "succ";
    }

    public static void main(String[] args) {
        SpringApplication.run(FormController.class, args);
    }
}
