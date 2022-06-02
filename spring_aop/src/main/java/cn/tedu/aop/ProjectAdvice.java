package cn.tedu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect // 用于增强测试 每个接口的性能 耗时
public class ProjectAdvice {
    // 切入点 时Service层的所有方法
    @Pointcut("execution(* cn.tedu.service.*Service.*(..))")
    private void servicePt(){

    }
    @Around("ProjectAdvice.servicePt()") // 共性advice绑定切入点
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        Signature signature = pjp.getSignature();//一次执行的签名信息， 封装了这次的执行过程
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        long start = System.currentTimeMillis();
        Object ret = null;
        for (int i = 0; i < 10000;++i) {
            ret = pjp.proceed();
        }
        System.out.println("测试业务层接口万次执行"+className+"."+methodName+"耗时:"+(System.currentTimeMillis()-start)+"ms,参数列表:"+ Arrays.toString(args));
        return ret;
    }
}
