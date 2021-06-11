package kovteba.linkedlist;

public class MyLinkedList<T> {

    private int size = 0;

    private Node<T> firstNode;

    private Node<T> lastNode;

    public void add(T element) {
        Node<T> newNode;
        if (checkThePositionIsEmpty()) {
            newNode = new Node<>(element);
            this.firstNode = newNode;
            this.lastNode = firstNode;
        } else {
            newNode = new Node<>(navigate(size - 1), element);
            navigate(size - 1).linkNext(newNode);
            lastNode = newNode;
        }
        this.size++;
    }

    private Node<T> findLastPosition() {
        Node<T> n = firstNode;
        while (n.getNext() != null) {
            n = n.getNext();
        }
        return n;
    }

    public int size() {
        return size;
    }

    public void add(int index, T element) {

        if (index < 0) {
            throw new IndexOutOfBoundsException("index = " + index);
        }

        Node<T> newNode;
        Node<T> previous;
        Node<T> next;

        if (index == 0) {
            newNode = new Node<>(null, element, firstNode);
            this.firstNode.linkPrevious(newNode);
            this.firstNode = newNode;
        } else {
            previous = navigate(index - 1);
            next = navigate(index);
            newNode = new Node<>(previous, element, next);
            previous.linkNext(newNode);
            next.linkPrevious(newNode);
        }

        this.size++;
    }

    public void remove(int index) {

        if (index < 0) {
            throw new IndexOutOfBoundsException("index = " + index);
        }

        if (index == 0) {
            this.firstNode = navigate(index + 1);
            this.firstNode.linkPrevious(null);
            this.firstNode.linkNext(navigate(index + 1));
        }  else {
            Node<T> previous = navigate(index - 1);
            Node<T> next = navigate(index + 1);
            navigate(index).setValue(null);
            previous.linkNext(next);
            next.linkPrevious(previous);
        }

        this.size--;
    }

    public void clear() {
        this.firstNode = null;
        this.size = 0;
    }

    public T get(int index) {

        try {
            return navigate(index).getValue();
        } catch (Exception e) {
            throw new IllegalArgumentException("method get");
        }
    }

    private boolean checkThePositionIsEmpty() {
        return firstNode == null;
    }

    public Node<T> navigate(int index) {

        Node<T> n = firstNode;

        for (int i = 1; i <= index; i++) {
            n = n.getNext();
        }

        return n;
    }

    public void testPreviousLink() {

        Node<T> n = lastNode;

        System.out.print(n.getValue() + ", ");

        while (n.getPrevious() != null) {
            n = n.getPrevious();
            System.out.print(n.getValue() + ", ");
        }
    }

    @Override
    public String toString() {

        if (checkThePositionIsEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        sb.append(firstNode.getValue());

        Node<T> n = firstNode;
        while (n.getNext() != null) {
            n = n.getNext();
            sb.append(", ").append(n.getValue());
        }

        return sb.append("]").toString();
    }

    private static final class Node<E> {

        private E value;

        private Node<E> next = null;

        private Node<E> previous = null;

        public Node() {
        }

        public Node(E value) {
            this.value = value;
        }

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        public Node(Node<E> previous, E value) {
            this.value = value;
            this.previous = previous;
        }


        public Node(Node<E> previous, E value, Node<E> next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void linkNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrevious() {
            return previous;
        }

        public void linkPrevious(Node<E> previous) {
            this.previous = previous;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    ", previous=" + previous +
                    '}';
        }
    }
}
