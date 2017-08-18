package cn.sepiggy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeRecordingAspect {

    @Pointcut("execution(* cn.sepiggy.aop..*.bookFlight(..))")
    private void timeRecordingPointCut() {
    }

    @Around("timeRecordingPointCut()")
    public Object recordTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        long start = System.currentTimeMillis();
        Object retVal = proceedingJoinPoint.proceed();

        long duration = System.currentTimeMillis() - start;
        System.out.println(String.format("time for booking flight is %d seconds", duration));
        return retVal;
    }
}
