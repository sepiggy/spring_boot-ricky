package cn.sepiggy.springboot.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {
    public static void main(String[] args) {
//        bossGoSomewhere();
        smartBossGoSomewhere();
    }

    static void bossGoSomewhere() {
        Boss boss = new Boss();
        boss.goSomeWhere();
    }

    static void smartBossGoSomewhere() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        SmartBoss boss = context.getBean(SmartBoss.class);
        boss.goSomewhere();
    }
}
