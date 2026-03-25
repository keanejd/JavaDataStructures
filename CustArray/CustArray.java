import java.util.Comparator;

 public class CustArray<T>{

    private T [] array;
    private T [] temp;
    private int size;
    private int tailPtr;
    private Comparator<T> comparator;
    private Class<T> type; 

    @SuppressWarnings("unchecked")
    CustArray( int _size, Comparator<T> _comparator, Class <T> _type ) { 
        this.array = (T[]) new Object[_size];
        this.size = _size; 
        this.tailPtr = 0; 
        this.temp = null;
        this.comparator = _comparator; 
        this.type = _type;
    }



    public void setElement(T _data, int _index) {array[_index] = _data;}
    public T getElement(int _index) {return  array[_index];}
    public int getSize() { return size;}
    public int getTail() { return tailPtr;}
    public Class<T> getType() { return type; }

    public void setSize(int _newSize) { size = _newSize;}
    public void setPtr(int _newTail) { tailPtr = _newTail;}
    public void incrementPtr() { tailPtr++; }
    public boolean isNull(int _index) { return array[_index] == null; }
    public boolean isEmpty() { return tailPtr == 0 ; }
    public boolean maxSize() { return  tailPtr >= size-1 ;}
    public boolean minSize() { return (size-1)/2 >= tailPtr; }
    
    public boolean equalElements(int _index1, int _index2){ 
        return comparator.compare(array[_index1], array[_index2]) == 0 ;}

    public boolean indexEquals(int _index, T _data) { 
        return comparator.compare(array[_index], _data) == 0;}

    public void swapElements(int _index1, int _index2){
        // copy the element at index 2
        T temp = getElement(_index2);
        setElement(array[_index1], _index2);
        setElement(temp, _index1);

    }

    public boolean containsElement(T _data){
        for(int i = 0; i < tailPtr ; i++) {
            if( indexEquals(i, _data) )
                return true;
        }

        return false;
    }

    public int returnIndex(T _data){
        for(int i = 0; i < tailPtr ; i++) {
            if( indexEquals(i, _data) )
                return i;
        }

        return -1;

    }

    public int numberOfduplicates(T _data){
        int count = 0;
        for(int i = 0; i < tailPtr; i++) {
            if(comparator.compare( array[i], _data ) == 0)
                count++;
        }
        return count;
    }

    public Integer [] indexDuplicates(T _data){
        Integer duplicateIndex [] =  new Integer[numberOfduplicates(_data)];
        int index = 0;

        for(int i = 0; i < tailPtr; i++)
            if(comparator.compare(array[i],_data) == 0)  duplicateIndex[index++] = i;

        return duplicateIndex;
    }

    public void printArray() {

        if(getSize() < 1 ) {
            System.out.println("Empty Array !");
            return;
        }
        for(int i = 0; i <tailPtr; i++)
            System.out.println(array[i].toString() + " CustArray");

    }

    public void printArray(T [] _printArray){
          if(getSize() < 1 ) {
            System.out.println("Empty Array !");
            return;
        }
        for(int i = 0; i < _printArray.length; i++)
            System.out.println(_printArray[i].toString() + " array Param CustArray");
    }


    public  void upsizeArray() {
            size *= 2;
            temp = (T[]) new Object[size];
            for(int i = 0 ; i  < tailPtr; i++) temp[i] = array[i];
            array = temp;

    }

    public void downsizeArray() {
       int newSize = size/2;
       if(tailPtr > newSize) return;
        size = newSize;
        temp = (T[]) new Object[size];
        for(int i = 0; i < tailPtr; i++) temp[i] = array[i] ;
        array = temp;
    }


    public void addElement(T _data){
        if( maxSize() ) upsizeArray();

        array[tailPtr++]= _data;

    }

    public void addElement(int _index, T _data){
        if( _index >= tailPtr ) addElement(_data);
        if( maxSize() ) upsizeArray();

        temp = (T[]) new Object[tailPtr -_index ];
        for(int i = 0, j = 0 ; i < temp.length; i++ , j++) temp[j] = array[i+_index];

        array[_index] = _data;

        for(int i = 0 ; i < temp.length ; i++) array[_index+1+i] = temp[i];
        tailPtr++;
        temp = null;
    }

    public T peek(int _index) {
        return array[_index];
    }


    public T removeElement(int _index){

        T removedValue = array[_index];
        temp = (T[]) new Object[tailPtr-1];

        for(int i = 0, j = 0; i < tailPtr; i++, j++)
            if( i == _index) j--;
            else
                temp[j] = array[i];

        array = temp ;
        temp = null;
        --tailPtr;

        if( minSize())  downsizeArray();

        return removedValue;
    }

    public T removeElement(T _data){

        int index = returnIndex(_data);
        if(index != -1 ) return removeElement(index);

        return null;

    }

    public void removeAll(T _data) {
        while(removeElement(_data) != null);
    }

    public void sort() {
        mergeSort(0, tailPtr-1);
    }

    private void mergeSort( int _left, int _right){
        if(_left >= _right) return;

        int mid = (_left + _right) / 2;

        mergeSort(_left, mid);
        mergeSort(mid+1, _right);
        merge(_left, mid, _right);
    }

    private void merge( int _left, int _mid, int _right) {
        int leftSize = _mid -_left + 1;
        int rightSize = _right -_mid;

        T[] leftArr = (T[]) new Object[leftSize];
        T[] rightArr = (T[]) new Object[rightSize];

        for(int i = 0; i < leftSize; i++) leftArr[i] = array[_left+i];

        for(int i = 0; i < rightSize; i++) rightArr[i] = array[_mid+1+i];

        int i = 0, j = 0, k = _left;

        while(i < leftSize && j < rightSize) {
            if(comparator.compare(leftArr[i], rightArr[j]) <= 0)
                array[k++] = leftArr[i++];
            else 
                array[k++] = rightArr[j++];
        }

        while(i < leftSize) array[k++] = leftArr[i++];
        while(j < rightSize) array[k++] = rightArr[j++];
    }
}

