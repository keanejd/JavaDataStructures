import zoo.Animal;
import zoo.AnimalTest;

public class Main{
    public static void main(String [] args) {

/*
      AnimalTest test = TestArray.fillThezoo(7,1,50);

      System.out.println(test.zoo[0].toString()+"\n");

      System.out.println("The Zoo size is: " + test.getSize()+"\n");

      CustArray<Animal> animals = new CustArray<>(test.getSize(), Animal.BY_TYPE);

      for(int i = 0; i < test.getSize(); i++){
        animals.addElement(test.zoo[i]);
      }

        // test print arrays
      animals.printArray();

      System.out.println("This is a test of the other print function \n");


        // test print params
      animals.printArray(test.zoo);
      System.out.println();
        //swap the first and last
      animals.swapElements(0, test.getSize()-1);

      animals.printArray();

      Animal temp  = animals.removeElement(0);
      System.out.println();
      System.out.println("The removed element is: " + temp.toString() + "\n");

      animals.printArray();

      for(int i = 0; i < 5; i++) {
         animals.addElement(temp);
    }
    System.out.println("Does the array contain temp ? " + animals.containsElement(temp));

    System.out.println("How many duplicates does the array contain ? " + animals.numberOfduplicates(temp));

    Integer [] copies = animals.indexDuplicates(temp);

    for(int i = 0; i < copies.length; i++) {
        System.out.println("We have a copy at: " + copies[i]);

    }

        animals.removeAll(temp);

        animals.printArray();

        animals.addElement(3,temp);
        animals.addElement(4, test.zoo[3]);


        System.out.println();
        animals.printArray();

        CustArray<Animal>  byAge = new CustArray<>( test.getSize(), Animal.BY_AGE);
        CustArray<Animal>  byName = new CustArray<>(test.getSize(), Animal.BY_NAME);

        for(int i = 0; i < test.getSize() ; i++){
          byAge.addElement(test.zoo[i]);
          byName.addElement(test.zoo[i]);

        }


        byAge.sort();
        System.out.println("--- BY Age ---");
        byAge.printArray();

        System.out.println("--- By Name ---");
        byName.printArray();

      */

      TestArray.testFunctions();

}

}
