package kovteba.myarraylist;

import java.util.Iterator;

public interface Container extends Iterable<Object> {

    void clear();

    int size();

    String toString();

    Iterator<Object> iterator();

}