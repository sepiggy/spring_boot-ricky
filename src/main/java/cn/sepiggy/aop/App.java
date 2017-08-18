package cn.sepiggy.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@EnableAspectJAutoProxy
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
