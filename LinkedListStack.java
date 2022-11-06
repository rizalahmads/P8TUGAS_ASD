package P8_ASD;

public class LinkedListStack<E> implements Stack<E> {
    private Node top = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void push(Object e) {
        Node newest = new Node(e, null);
        newest.setNext(top);
        top = newest;
        size++;
    }

    public E top() {
        if (isEmpty())
            return null;
        return (E) top.getElement();
    }

    public E pop() {
        if (isEmpty())
            return null;
        Object answer = top.getElement();
        top = top.getNext();
        size--;
        return (E) answer;
    }

    private class Node {
        private Object element;
        private Node next;

        public Node(Object e, Node n) {
            element = e;
            next = n;
        }

        public Object getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node n) {
            next = n;
        }
    }
}
