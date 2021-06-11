package kovteba.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println(invocation.getMethod());
        System.out.println((Arrays.toString(invocation.getArguments())));
        int returnValue = (int)invocation.proceed();

        return returnValue + 1000;
    }
}
