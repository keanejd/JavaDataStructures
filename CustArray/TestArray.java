
import zoo.Animal;
import zoo.AnimalTest;
import java.util.Random;

public class TestArray{

public static AnimalTest fillThezoo(int _numAnimals, int _minAge, int _maxAge){

    AnimalTest theZoo = new AnimalTest();

    theZoo.fillZoo(_numAnimals, _minAge, _maxAge);

    return theZoo;

}

public static <T> void FillArray(CustArray<T>  _c, T [] _array, int _size ) {

    System.out.println("We are filling the Array with this many elements: " +_size + " Of type: " + _c.getType()  );
    for(int i = 0; i < _size; i++){
        _c.addElement(_array[i]);
    }
}

public static <T> void printArray(CustArray<T> _c) {
    System.out.println("The array size is " + _c.getSize() + " The tail pointer is at " + _c.getTail() );
    System.out.println();
    _c.printArray();
    System.out.println();
}

public static <T> void printArray(CustArray<T> _c, T [] _array) {
    
    System.out.println();
    System.out.println("This is a test of the overloaded method ");
    _c.printArray(_array);
    System.out.println();
}

public static <T> void swapTest(CustArray<T> _c, int _a, int _b) {
    System.out.println("-----------------Testing the swap function----------------------");
    System.out.println("Before the swap");
    printArray(_c);
    _c.swapElements(_a, _b);
    System.out.println("After the swap");
    printArray(_c);
}

public static <T> void removeTest(CustArray<T> _c, int _a ) {

    T temp = _c.removeElement(0);
     System.out.println("-----------------Testing the remove function----------------------");
     System.out.println();
     System.out.println("The removed element is: " + temp + "\n");

     printArray(_c);

}

public static <T> void  addElementTest(CustArray<T> _c, T [] _array, int _a) {
    System.out.println("-----------------Testing the add function----------------------");
    Random rando = new Random();

    for(int i = 0; i < _a; i++) {
        _c.addElement(_array[rando.nextInt(_array.length)]);
    }

    printArray(_c);

}

public static <T> void addDuplicates(CustArray<T> _c,  T [] _array, int _a) {
    Random rando = new Random();
      System.out.println("-----------------Testing the add duplicates function----------------------");
    

    for(int i = 0; i < _a; i++) {
        T temp = _array[rando.nextInt(_array.length)];
        _c.addElement(temp);
    }
    printArray(_c);

}

public static <T> void findDuplicates(CustArray<T> _c, T _data) {
   System.out.println("-----------------Testing the add duplicates function----------------------");
   System.out.println("=================Finding Duplicates of the First Element==================");
    Integer [] duplicates = _c.indexDuplicates(_data);

    for(int i = 0; i < duplicates.length; i++) {
        System.out.println("The " + i + " duplicate is "+ _c.peek(duplicates[i] ));
    }

    T temp = _c.getElement(duplicates[0]); 
    System.out.println("=================Removing Duplicates of the First Element==================");
    removeDuplicates(_c, temp);

}

public static <T> void removeDuplicates(CustArray<T> _c, T _data) {
      System.out.println("-----------------Testing the remove all duplicates function----------------------");
    _c.removeAll(_data);

    printArray(_c);
}

public static <T> void sortArray(CustArray<T> _c) {
    System.out.println("------------------Sorting the Array----------------------");
    System.out.println("=================Sorting the animals by AGE ==================");
    _c.sort();
    printArray(_c);
}



public static <T> void testFunctions() {

    AnimalTest test = fillThezoo(15, 1, 50);
    
    CustArray<Animal> animalArr = new CustArray<>(test.getSize()/2, Animal.BY_AGE, Animal.class);

    FillArray( animalArr, test.zoo, test.getSize()/2);
    printArray(animalArr);

    printArray(animalArr, test.zoo);

    swapTest(animalArr, 0, 6);    

    removeTest(animalArr, 0);

    addDuplicates(animalArr, test.zoo, test.getSize());

    findDuplicates(animalArr, animalArr.getElement(0));

    sortArray(animalArr);


}




}


