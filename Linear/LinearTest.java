import zoo.Animal;
import zoo.AnimalTest;
import java.util.Random;

public class LinearTest {

    public static AnimalTest fillThezoo(int _numAnimals, int _minAge, int _maxAge){

        AnimalTest theZoo = new AnimalTest();

         theZoo.fillZoo(_numAnimals, _minAge, _maxAge);

        return theZoo;

    }
    public static <T>  void fillQueue(T [] _a , int _size, Queue<T> _q)  {
        for( int  i = 0; i < _size ; i++)
            _q.offer(_a[i]);

    }

    public static <T> void fillStack(T [] _a, int _size,  Stack<T> _s)  {
        for( int  i = 0; i < _size ; i++)
            _s.push(_a[i]);

    }

    
    public static <T> void fillList(T [] _a, int _size,  DoubleList<T> _d)  {
        for( int  i = 0; i < _size ; i++)
            _d.add(_a[i]);

    }

    
    public static <T> void printStack(Stack<T> _s) {
        
        System.out.println("------------This is the Stack----------------------");
        System.out.println("The Stack size is " + _s.getSize() );
        System.out.println();
        _s.printStack();
        System.out.println();
    
    }

     public static <T> void printList(DoubleList<T> _d) {
        
        System.out.println("------------This is the List----------------------");
        System.out.println("The List size is " + _d.getSize() );
        System.out.println();
        _d.printList();
        System.out.println();
    
    }

     public static <T> void printQueue(Queue<T> _q) {
        
        System.out.println("------------This is the Que----------------------");
        System.out.println("The Queue size is " + _q.getSize() );
        System.out.println();
        _q.printQueue();
        System.out.println();
    
    }

    public static <T> void testPeek(Stack<T> _s, Queue<T> _q ){

        System.out.println("At the top of the Stack we have----------> "+ _s.peek()+"\n");

        System.out.println("At the front of the Queue we have--------> "+ _q.peek()+"\n");

    }

    public static <T> void testPollPop(Stack<T> _s,  Queue<T> _q ){
        T temp1 = _s.pop();
        T temp2 = _q.poll();
        System.out.println("We popped this value off the Stack----------------> "+temp1+"\n");
        System.out.println("We got this value from the front of the Queue ----> "+ temp2+"\n");

        System.out.println("Putting the value--------> " + temp1 + "--------------> into the Queue ");
        _q.offer(temp1);
        System.out.println("We are pushing ------> "+ temp2+ "---------> onto the Stack \n " );
        _s.push(temp2);

        printStack(_s);
        printQueue(_q);

    }

    public static <T> void testLookup(DoubleList<T> _l, Stack<T> _s) {
       
       T temp = _s.pop();
        System.out.println("Finding the index of: " + temp  );
        System.out.println("The index is " + _l.indexOf(temp) );

        printList(_l);
        System.out.println("Removing ---> " + temp );
        System.out.println("Was the value removed: " +  _l.ifRemoved(temp) );
        System.out.println("Check is " + temp + " in the list now:" + _l.inList(temp) );
        printList(_l);
        System.out.println("Remvoing the value at index 4 " + _l.removeAtIndex(4) );
        printList(_l);
    }



    
    public static void TestLinear() {

        AnimalTest q = fillThezoo(10, 1, 50);

        AnimalTest s = fillThezoo(10, 1, 50);

        Queue<Animal> testQueue = new Queue<>( Animal.BY_AGE, Animal.class);
        Stack<Animal> testStack = new Stack<>( Animal.BY_AGE, Animal.class);
        DoubleList<Animal> testList = new DoubleList<>(Animal.BY_AGE, Animal.class);
    

        fillQueue(q.zoo, q.getSize(),testQueue);
        fillStack(s.zoo, s.getSize(), testStack);

        printQueue(testQueue);

        printStack(testStack);

        testPeek(testStack, testQueue);

        testPollPop(testStack, testQueue);
        fillList(s.zoo, s.getSize(), testList );
        fillList(q.zoo, s.getSize(), testList );
       
        printList(testList);
        testLookup(testList, testStack);


    }
}