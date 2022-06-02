package cn.tedu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {

//    @Pointcut("execution(void cn.tedu.dao.UserDao.update())") //切入点
//    @Pointcut("execution(void cn.*.*.*.update())") //切入点
//    @Pointcut("execution(void *..update())") //切入点
//    @Pointcut("execution(* *..u*())") //切入点
    @Pointcut("execution(* cn.tedu.dao.UserDao.select())") //切入点
    private void pointCut(){

    }
    @Pointcut("execution(public int *.*.*.*.select())")
    private void pointCut2(){

    }

    // 共性方法
    @Before("pointCut()") // advice绑定切入点
    // 前置通知
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        Signature signature = jp.getSignature();
        String typeName = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        System.out.println(typeName+"."+methodName+"的参数有:"+Arrays.toString(args));
        System.out.println("before advice");
//        System.out.println(System.currentTimeMillis());
    }
    //后置通知
    @After("pointCut()")
    public void after(){
        System.out.println("after advice");
    }
    //环绕通知
    @Around("pointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");
           //表示对原始操作的调用
        Object ret = pjp.proceed();
        System.out.println("around after advice");
        return ret;
    }

    //环绕通知
//    @Around("pointCut2()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around advice before select");
        //表示对原始操作的调用
        Object ret = pjp.proceed();
        System.out.println("around advice after select");
        return ret;
    }
    // 返回后通知  只有没有抛异常时才运行
    @AfterReturning(value = "pointCut()",returning ="ret" )
    public void afterReturning(JoinPoint jp,Object ret){
        System.out.println("afterReturning advice 返回值:"+ret);
    }
    // 抛出异常后通知
    @AfterThrowing(value = "pointCut()",throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("afterThrowing advice 异常:"+t);
    }
}
