import java.util.Comparator;

public class DoubleList<T> {

    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int size;
    private Comparator<T> comparator;
    private Class<T> type; 
     
    @SuppressWarnings("unchecked")
    DoubleList(Comparator<T> _comparator, Class<T> _type) { 
        this.head = null; 
        this.tail = null; 
        this.size = 0;
        this.comparator = _comparator;
        this.type = _type;
    }



    public DoubleNode<T> getHead() { return head;}
    public DoubleNode<T> getTail() { return tail;}
    public int getSize() { return size;}
    public boolean isEmpty() { return head == null && tail == null ; }
    public Class<T> getType() {return type;}

    public void clear() {
        DoubleNode<T> current = head;
        while(current != null ) {
            DoubleNode<T> next = current.getNext();
            current.setPrev(null);
            current.setNext(null);
            current.setData(null);
            current = next;
        }
            head = tail =  null;
            size = 0;
    }

   
    public void addFront(T _data){
    
     if (_data == null) throw new IllegalArgumentException("null data not permitted");
       DoubleNode<T> temp = new DoubleNode(_data);
       if(isEmpty())
            head = tail = temp;
       else{
             head.setPrev(temp);
             temp.setNext(head);
             head = temp;
            }

      size++;

    }

    public void addRear(T _data){
    
     if (_data == null) throw new IllegalArgumentException("null data not permitted");
              DoubleNode<T> temp = new DoubleNode(_data);

       if(isEmpty()) { head = tail = temp;}
       else{ tail.setNext(temp);  temp.setPrev(tail); tail = temp; }

       size++;
    }
    // default just adds to the back of the list
    public void add( T _data) {
        addRear(_data);
    }
    
    public T removeFront() {

        if( isEmpty() ) return null; // empty

        T temp = head.getData();
        head = head.getNext();

        if (head != null) head.setPrevNull() ;//
        else
            tail = null;// the head is empty so make sure the tail is null
        size--;
        return temp;
    }

    public T removeBack(){

        if(isEmpty() ) return null;
        T temp = tail.getData();

        tail = tail.getPrev();
        if (tail != null)  tail.setNextNull();
        else
            head = null;
        size--;
        return temp;
    }

    public T peekFront() {
        if( isEmpty() ) return null;
        return head.getData();
    }

    public T peekRear() {
        if(isEmpty() ) return null;
        return tail.getData();
    }

    private T remove(DoubleNode<T> _node ) {
        if(_node.getPrev() == null) return removeFront();
        if(_node.getNext() == null) return removeBack();
        
        T data = _node.getData();

        _node.getNext().setPrev(_node.getPrev() );
        _node.getPrev().setNext(_node.getNext() );

        _node.setNextNull();
        _node.setPrevNull();
        _node.setData(null);

        size--;
        return data;   
    }

    public T removeAtIndex(int _index) {
        if(_index >= size || _index < 0 ) {
            System.out.println("Check your _index value");
            return null;
        }
        DoubleNode<T> temp;
        int i;
        // start at the back
        if( _index >  (size/2) ){
            for(i = size-1, temp = tail; _index != i; i-- )
                temp = temp.getPrev();
        }
        else{
            for(i = 0 , temp = head; _index != i; i++)
                temp = temp.getNext();
        }
        return remove(temp);
    }

    public boolean ifRemoved(T _data) {
        DoubleNode<T> temp;

        for( temp = head ; temp != null; temp = temp.getNext()) {
            if( temp.getData().equals(_data) ){
                remove(temp);
                return true;
            }
        }
        return false;
    }

    public int indexOf(T _data){
        DoubleNode<T> temp;
        int index = 0;
        for(temp = head; temp != null; index++){
                if( temp.getData().equals(_data) )
                    return index;
            temp = temp.getNext();
        }
        return -1;
    }

    public boolean inList( T _data) {
        return indexOf(_data) != -1;
    }

     public void printList() {
            DoubleNode<T> trav = head;

            while(trav != null) {
                System.out.println(trav.toString() + " DOUBLE--> " );
                trav = trav.getNext();
            }

            System.out.println("The end of the DoubleList  " + size);
        }

}
