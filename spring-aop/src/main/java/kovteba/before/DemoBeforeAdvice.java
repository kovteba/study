package kovteba.before;

import org.springframework.aop.framework.ProxyFactory;

public class DemoBeforeAdvice {
    public static void main(String[] args) {
        MessageWriter target = new MessageWriter();

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new BeforeAdvice());
        pf.setTarget(target);

        MessageWriter proxy = (MessageWriter) pf.getProxy();

        proxy.writeMessage();
    }
}
