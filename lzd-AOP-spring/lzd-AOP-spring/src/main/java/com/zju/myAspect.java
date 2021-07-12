package com.zju;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;


@Aspect
public class myAspect {
    @Pointcut(value = "execution(* *.doSome(..))")
    //辅助功能定义切入点
    private void myPointCut1(){}

    @Before(value = "myPointCut1()")
    //不能有返回值，必须是void方法，并可以调用JointPoint
    public void doBefore(@org.jetbrains.annotations.NotNull JoinPoint jp){
        System.out.println("Before方法被调用");
    }

    @AfterReturning(value = "myPointCut1()",returning = "res")
    //必须有返回值，必须是void方法，形参中必须要有与returning = 同名的参数如res，并可以调用JointPoint
    public void doAfterRetuning(Object res){
        System.out.println("AfterReturning方法被调用了");
        if(res instanceof StudentTest){
            ((StudentTest)res).age = 55;
        }
    }

    /**
     * 控制目标方法是否被执行
     * 修改原来目标方法的结果
     * 目标方法的前后都能增强功能
     */
    @Around(value = "myPointCut1()")
    //参数ProceedingJoinPoint等同于Method,作用相当于InvocationHandler接口中的method.invoke方法
    //返回值相当于最后目标方法的返回值，因此可以改变，相当于把Test类中的目标方法执行改为doAround方法

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Around前");
        Object res = pjp.proceed();
        System.out.println("Around后");
        return res;
    }

    /**
     * 异常通知
     * 抛出异常
     */
    @AfterThrowing(value ="myPointCut1()",throwing = "e")
    //throwing的参数和形参Exception的名字必须相同
    public void doAfterThrowing(Exception e){
        System.out.println("AfterThrowing方法被调用了，异常是" + e);
    }

    /**
     * 最终通知
     */
    @After(value = "myPointCut1()")
    //没有参数，如果有那就是JoinPoint
    //总会被执行，类似于Finally
    public void doAfter(){
        System.out.println("After被调用了");
    }
}
