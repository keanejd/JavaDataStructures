public class doubleList<T> {

    private doubleNode<T> head;
    private doubleNode<T> tail;
    private int size;

    doubleList() { this.head = null; this.tail = null; size = 0;}

    public doubleNode<T> getHead() { return head;}
    public doubleNode<T> getTail() { return tail;}
    public int getSize() { return size;}
    public void setSize(int _newSize) {size = _newSize; }
    public boolean isEmpty() { return head == null && tail == null ; }

    public void addFront(T _data){

       if(isEmpty())
            head = tail = new doubleNode(_data);
       else{
             doubleNode<T> temp = new doubleNode(_data);
             head.setPrev(temp);
             temp.setNext(head);
             head = temp;
            }

      size++;

    }

    public void addRear(T _data){
          doubleNode<T> temp = new doubleNode(_data);

       if(isEmpty()) { head = tail = temp;}
       else{ tail.setNext(temp);  temp.setPrev(tail); tail = temp; }

       size++;
    }

    public T removeFront() {

        if( isEmpty() ) return null; // empty

        T temp = head.getData();
        head = head.getNext();

        if (head != null) head.setPrevNull() ;//
        else
            tail = null;// the head is empty so make sure the tail is null

        return temp;
    }

    public T removeBack(){

        if(isEmpty() ) return null;
        T temp = tail.getData();

        tail = tail.getPrev();
        if (tail != null)  tail.setNextNull();
        else
            head = null;

        return temp;
    }

   public boolean searchList( T _key){
            doubleNode<T> current = head;

                while( current != null)
                {
                    if(current.getData().equals(_key))
                        return true;

                    current = current.getNext();

                }

                return false;
    }

    public T removeMiddle(T _key){
        doubleNode<T> current = head;

        while( current != null){
            if(current.getData() == _key){
                doubleNode<T> temp = current;
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                size--;
                return temp.getData();
            }
            current = current.getNext();
        }
        return null;

    }

      public void insertAtIndex(T _data , int _index ) {
            if(_index < 0 || _index >size)
                throw new IndexOutOfBoundsException("Index is out of bounds");

            node<T> doubleNode = new doubleNode<>(_data);

            if(_index == 0)
                addFront(_data);
            else if(_index >= size)
                addRear(_data);
            else{

                    node<T> current = head;

                    int i = 1;
                    while( i != _index -1) {
                        current = current.getNext();
                        i++;
                    }

                    addMiddle()
                }

        }


     public void printList() {
            doubleNode<T> trav = head;

            while(trav != null) {
                System.out.println(trav.toString() + " DOUBLE--> " );
                trav = trav.getNext();
            }

            System.out.println("The end of the doubleList  " + size);
        }


}
