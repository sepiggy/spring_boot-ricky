package cn.sepiggy.springboot.thymeleaf.model;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post {
    private static long count = 1;
    private Long id;
    private String title;
    private String content;
    private Date created;

    public Post() {
    }

    public Post(String title, String content) {
        this.id = count++;
        this.title = title;
        this.content = content;
        this.created = new Date();
    }
}
