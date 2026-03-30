package zoo;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;

public class AnimalTest {
  private static final int  PRIORITY_RANGE = 1000000;
  private String [] animalNames;
  private String [] animalType;
  private int size;
  public Animal [] zoo;



  public AnimalTest(){

      this.animalNames = readText("../zoo/zoo/names.txt");
      this.animalType = readText("../zoo/zoo/animals.txt");
      this.size = 0;
  }

  public int getSize() { return size;}

   public String []  readText(String _fileName)
    {
      List<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(_fileName))){

            String textLine;

            while(( textLine = reader.readLine() ) != null )
                words.add(textLine);
        }


        catch (FileNotFoundException e) {
            System.out.println("Error ! File not found: " + _fileName);
        }

        catch (IOException e) {
            System.out.println("Error reading file ! ");
        }

        return words.toArray(new String[0]);
    }

    public int randomNumber( int _min , int _max) {

      return ( (int) (Math.random() * (_max - _min + 1)) + _min);
    }

   public String chooseName() {
        return animalNames[randomNumber(0, animalNames.length-1)];
   }

   public String chooseType() {
        return animalType[ randomNumber(0, animalType.length - 1) ];
   }

   public void fillZoo(int _numAnimals, int _minAge, int _maxAge) {
       zoo = new Animal[_numAnimals];

      for( int i = 0; i < _numAnimals; i++){
          zoo[i] = new Animal(chooseName(), randomNumber(_minAge, _maxAge), 
            chooseType(), randomNumber( 0, PRIORITY_RANGE));
          size++;
         // System.out.println(Zoo[i].toString());
      }
   }

   public Animal randomAnimal() {
    return zoo[ randomNumber(0, zoo.length - 1) ]; 
   }

}
