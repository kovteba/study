package kovteba.trowadvice;

import org.springframework.aop.framework.ProxyFactory;

public class DemoTrowsAdvice {

    public static void main(String[] args) throws Exception {
        ErrorBean errorBean = new ErrorBean();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(errorBean);
        pf.addAdvice(new ThrowsAdviceExample());

        ErrorBean proxy = (ErrorBean) pf.getProxy();

        try {
            proxy.errorProneMethod();
        } catch (Exception ignored) {

        }

        try {
            proxy.otherErrorProneMethod("error");
        } catch (Exception ignored) {

        }
    }
}
