package kovteba.around;

import org.springframework.aop.framework.ProxyFactory;

public class DemoAroundAdvice {

    public static void main(String[] args) {
        WorkerBean bean = getWorkerBean();
        var i = bean.doSomeWork(100000);
        System.out.println("RESULT " + i);
    }

    private static WorkerBean getWorkerBean() {
        WorkerBean target = new WorkerBean();

        ProxyFactory factory = new ProxyFactory();
        factory.setTarget(target);
        factory.addAdvice(new AroundAdvice());

        return (WorkerBean)factory.getProxy();
    }
}
