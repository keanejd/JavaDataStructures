public class doubleNode<T> {

    private T data;
    private doubleNode<T> next;
    private doubleNode<T> prev;

    public doubleNode(){ this.data = null; this.next = null; this.prev = null;} // default
    public doubleNode(T _data){ this.data = _data; this.next = null; this.prev = null;} // data only
    public doubleNode(T _data,  doubleNode<T> _next, doubleNode<T> _prev) { this(_data); this.next = _next; this.prev = _prev;} // for inserting inbetween or at the front or back

    // getter functions
    public T getData() { return data; }
    public doubleNode<T> getNext() { return next; }
    public doubleNode<T> getPrev() { return prev;}


    //setter functions
    public void setData(T _newData) { data = _newData; }
    public void setNext(doubleNode<T> _newNext) { next = _newNext; }
    public void setPrev(doubleNode<T> _newPrev) { prev = _newPrev; }
    public void setNextNull() { next = null;}
    public void setPrevNull() { prev = null;}


    @Override
    public String toString(){ return (data == null)? "NULL" : data.toString();}

}





