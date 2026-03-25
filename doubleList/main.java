import java.util.Iterator;


public class main {
public static void main(String [] args){

  //  genLinkedlist<Object> testString = new genLinkedlist<>();
    //que<String> testQue = new que<>();
    //animal mike  = new animal("mike", 3, "horse");
   // animal steve = new animal("steve", 2, "alligator");
    String a = "New Orleans ", b = "Baton Rougue",  c = "Buffer",  d = "gleep";


   // Stack<Integer> s = new Stack();

/*
    for(int i = 0; i <10; i++)
    {
        s.push(i*2);
    }


    System.out.println(s.peek());

    Integer temp = s.pop();

    System.out.println(temp);

    System.out.println(s.peek());

    Iterator<Integer> it = s.iterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }
*/

/*
    custArray testArray = new custArray(5);

    testQue.enQue(a);
    testQue.enQue(b);
    testQue.enQue(c);


    testString.addNode(c);
    testString.addNode(b);

    testString.addNode(mike);
    testString.addNode(steve);
    testString.addNode(a);
    testString.addNodeFront(a);
    testString.insertAtIndex("Is this postiion 4", 4);
    testString.printList();
*/
    doubleList<String> testList = new doubleList();

    testList.addFront("avsnwerpuibnwer#$!%#$ ");
    testList.addRear("ajngbe$#!%4i ");
    testList.addFront(a);
    testList.addRear(b);
    testList.addFront(c);
    testList.addRear(d);
    testList.printList();

    System.out.println();

   String temp =  testList.removeMiddle(b);

    testList.printList();

  System.out.println("The removed string is " + temp);


 //   testQue.printQue();


//   System.out.println("Is it in the List: " + testString.searchList( mike ) );
 //  System.out.println("Get Node " + testString.getNode(3));


/*

    System.out.println(mike.toString() );

    int test  = testString.getSize();

    for(int i = 0; i < test; i++)
        {
            testArray.addElement(testString.getNode(i));
        }

    String s = "I think this is of type T []";

      testArray.addElement(s);
    testArray.addElement(15);
      testArray.addElement("hello");
      testArray.addElement('W');
      testArray.addElement(78.00);




    testArray.printArray();
    System.out.println("The custom array size is " + testArray.getSize());
    System.out.println("THe tailPTr is at " + testArray.getTail() );

     testArray.addElement(s);
    testArray.addElement(15);
      testArray.addElement("hello");
      testArray.addElement('W');
      testArray.addElement(78.00);
      testArray.swapElements(0, 1);
       testArray.printArray();

        System.out.println("The custom array size is " + testArray.getSize());
    System.out.println("THe tailPTr is at " + testArray.getTail() );

    int n = testArray.numberOfduplicates("hello");
    System.out.println(n);

    Integer [] duplicate = testArray.indexDuplicates("hello");
    System.out.println("//////////////////////////////////////////////////");

    testArray.addElement(2, "New Element at Index 2");
    System.out.println(testArray.removeElement(2));
    System.out.println(testArray.removeElement("New Orleans "));
    testArray.swapElements(0,1);
    testArray.swapElements(1,2);
     testArray.swapElements(2,3);
    testArray.printArray();
*/

    }

}
