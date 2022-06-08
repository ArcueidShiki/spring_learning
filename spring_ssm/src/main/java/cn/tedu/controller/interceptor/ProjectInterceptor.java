package cn.tedu.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//拦截器数属于SpringMVC
@Component
public class ProjectInterceptor implements HandlerInterceptor {
    //覆盖三个默认方法
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("ProjectInterceptor.preHandle");
        return true; //改成true 才会执行post complete操作
        // 在方法执行前做校验。决定返回true/false false:如果多个拦截器链 后序的也不执行
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("ProjectInterceptor.postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("ProjectInterceptor.afterCompletion");
    }
}
