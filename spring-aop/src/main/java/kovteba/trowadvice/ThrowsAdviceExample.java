package kovteba.trowadvice;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;
import java.util.Arrays;

public class ThrowsAdviceExample implements ThrowsAdvice {

    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("Caught: " + ex.getClass().getName());
    }

    public void afterThrowing(Method method, Object[] args, Object target, IllegalArgumentException ex) throws Throwable {
        System.out.println("Caught: " + ex.getClass().getName());
        System.out.println("Method: " + method.getName());
        System.out.println("Args " + Arrays.toString(args));
    }
}
