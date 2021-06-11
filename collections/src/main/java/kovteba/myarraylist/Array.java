package kovteba.myarraylist;

public interface Array extends Container {

    void add(Object element);

    void set(int index, Object element);

    Object get(int index);

    int indexOf(Object element);

    int remove(int index);

}
