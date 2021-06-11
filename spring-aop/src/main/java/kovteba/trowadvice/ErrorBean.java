package kovteba.trowadvice;

import java.util.Objects;

public class ErrorBean {

    public void errorProneMethod() throws Exception {
        throw new Exception("Foo");
    }

    public void otherErrorProneMethod(String value) throws IllegalArgumentException {
        if (Objects.equals(value, "error")){
            throw new IllegalArgumentException("Bar");
        }
    }
}
