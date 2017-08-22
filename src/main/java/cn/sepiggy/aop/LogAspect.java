package cn.sepiggy.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(* cn.sepiggy.aop..*.bookFlight(..))")
    private void logPointCut() {
    }

    @AfterReturning(pointcut = "logPointCut()()", returning = "retVal")
    public void logBookingStatus(boolean retVal) {
        if (retVal) {
            System.out.println("booking flight succ!");
        } else {
            System.out.println("booking flight fail!");
        }
    }
}
