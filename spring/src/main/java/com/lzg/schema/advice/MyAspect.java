package main.java.com.lzg.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 */
public class MyAspect {

    public void before() {
        System.out.println("MyAspect before.");
    }

    public void afterReturning() {
        System.out.println("MyAspect afterReturning.");
    }

    public void afterThroing() {
        System.out.println("MyAspect afterThroing.");
    }

    public void after() {
        System.out.println("MyAspect after.");
    }

    public void around(ProceedingJoinPoint pjp) {
        Object obj = null;
        try {
            System.out.println("MyAspect around1.");
            obj = pjp.proceed();
            System.out.println("MyAspect around2.");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public void aroundInit(ProceedingJoinPoint pjp, String bizName, int times) {
        System.out.println(bizName + " " + times);
        Object obj = null;
        try {
            System.out.println("MyAspect aroundInit1.");
            obj = pjp.proceed();
            System.out.println("MyAspect aroundInit2.");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
