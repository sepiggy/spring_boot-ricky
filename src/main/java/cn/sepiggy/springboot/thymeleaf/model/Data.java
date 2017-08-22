package cn.sepiggy.springboot.thymeleaf.model;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Post> posts = new ArrayList<Post>();

    static {
        posts.add(new Post("title1", "content1"));
        posts.add(new Post("title2", "content2"));
    }

    public static Post getById(final long id) {
        return posts.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .get();
    }
}
