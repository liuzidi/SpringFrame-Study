package com.zju;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;



@Aspect
public class myAspect {
    @Before(value = "execution(* *.doSome(..))")
    //不能有返回值，必须是void方法，并可以调用JointPoint
    public void doBefore(@org.jetbrains.annotations.NotNull JoinPoint jp){
        System.out.println(jp.getSignature().getName()+"方法");
        System.out.println("代理前执行doBefore方法");
    }

    @AfterReturning(value = "execution(* *.doSome(..))",returning = "res")
    //必须有返回值，必须是void方法，形参中必须要有与returning = 同名的参数如res，并可以调用JointPoint
    public void doAfterRetuning(Object res){
        System.out.println("代理后执行doAfterReturning方法");
        if(res instanceof StudentTest){
            ((StudentTest)res).age = 55;
        }
    }

    /**
     * 控制目标方法是否被执行
     * 修改原来目标方法的结果
     * 目标方法的前后都能增强功能
     */

    @Around(value = "execution(* *.doSome(..))")
    //参数ProceedingJoinPoint等同于Method,作用相当于InvocationHandler接口中的method.invoke方法
    //返回值相当于最后目标方法的返回值，因此可以改变，相当于把Test类中的目标方法执行改为doAround方法

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        Object res = null;
        res = pjp.proceed();
        System.out.println("环绕后");
        return res;
    }
}
