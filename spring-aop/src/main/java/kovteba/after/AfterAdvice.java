package kovteba.after;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, 
             Object[] args, Object target) throws Throwable {
        System.out.println("");
        System.out.println("After method: " + method.getName());
    }
}
