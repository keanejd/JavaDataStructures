public class DoubleNode<T> {

    private T data;
    private DoubleNode<T> next;
    private DoubleNode<T> prev;

     // default
    public DoubleNode(T _data){ this.data = _data; this.next = null; this.prev = null;} // data only
    public DoubleNode(){ this(null);}
    // getter functions
    public T getData() { return data; }
    public DoubleNode<T> getNext() { return next; }
    public DoubleNode<T> getPrev() { return prev;}


    //setter functions
    public void setData(T _newData) { data = _newData; }
    public void setNext(DoubleNode<T> _newNext) { next = _newNext; }
    public void setPrev(DoubleNode<T> _newPrev) { prev = _newPrev; }
    public void setNextNull() { next = null;}
    public void setPrevNull() { prev = null;}


    @Override
    public String toString(){ return (data == null)? "NULL" : data.toString();}

}





