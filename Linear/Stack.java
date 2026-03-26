import java.util.Comparator;

public class Stack<T> {

    private DoubleList<T> list; 

    public Stack(Comparator<T> _comparator, Class<T> _type) {
            list = new DoubleList<>(_comparator, _type);
    }

    public Stack(Comparator<T> _comparator, Class<T> _type, T _data) {
            this(_comparator, _type);
            push(_data);
    }
    public boolean isEmpty() {
        return getSize() == 0;
    }
    public int getSize() {
        return list.getSize();
    }

    public T peek() {
        if( isEmpty() ) {
            System.out.println("The Stack is empty");
            return null;
        }
        return list.peekFront();
    }

    public T pop() {
        if( isEmpty() ) {
            System.out.println("The Stack is empty");
            return null;
        }
        return list.removeFront();
    }

    public void push(T _data){
        list.addFront(_data);
    }
    
}