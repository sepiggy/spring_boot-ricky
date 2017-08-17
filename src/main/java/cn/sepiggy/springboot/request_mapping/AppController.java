package cn.sepiggy.springboot.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/posts")
public class AppController {

    @RequestMapping("/create")
    @ResponseBody
    public String create() {
        return "mapping url is /posts/create";
    }
}
