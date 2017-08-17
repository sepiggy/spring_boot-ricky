package cn.sepiggy.springboot.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "Hello World!";
  }

  @RequestMapping("/home")
  @ResponseBody
  public String home() {
    return "Hello Home!";
  }

  @RequestMapping("/html")
  @ResponseBody
  public String html() {
    return "<html><head><title>Hello World!</litle></head><body><h1>Hello World!</h1><p>This is my first web site</p></body></html>";
  }

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
