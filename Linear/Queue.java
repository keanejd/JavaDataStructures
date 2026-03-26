import java.util.Comparator;

public class Queue<T> {
    private DoubleList<T> list;

    public Queue(Comparator<T> _comparator, Class<T> _type) {
        this.list = new DoubleList<>(_comparator, _type);
    }

    public int getSize(){return list.getSize();}

    public boolean isEmpty(){ return getSize() == 0 ;}

    public T peek() { 
        if(isEmpty()){
            System.out.println(" The Queue is Empty");
            return null;
        }    
        return list.peekFront();
    }

    public T poll() { 
        if( isEmpty() ) {
            System.out.println(" The Queue is Empty");
            return null;
        }
        return list.removeFront();
    }

    public void offer(T _data) {
        list.addRear(_data);
    }
}