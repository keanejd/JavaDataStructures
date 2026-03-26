package zoo;

import java.util.Comparator;
import java.util.Objects;


public class Animal{

    protected String name;
    protected int age;
    protected String type;

    //comparators
    public static final Comparator<Animal> BY_NAME = 
        Comparator.comparing( a -> a.name.toLowerCase());

    public static final Comparator<Animal> BY_AGE =
        Comparator.comparing( a -> a.age);

    public static final Comparator<Animal> BY_TYPE = 
        Comparator.comparing(a -> a.type.toLowerCase());


    public Animal() {
        this.name = "Unkown";
        this.age = 0;
        this.type = "Unkown";

    }

    public Animal(String _name, int _age, String _type){

        this.name = _name;
        this.age = _age;
        this.type = _type;

    }

    public Animal(Animal _other) {
        this.name = _other.name;
        this.age = _other.age;
        this.type = _other.type;
    }

    public String getName() { return name;}
    public int getAge() {return age;}
    public String getType() { return type;}



    public void setName(String _name) { this.name = _name;}
    public void setAge(int _age) { this.age = _age;}
    public void setType(String _type) { this.type = _type; }

   @Override
   public boolean equals(Object _obj) {
    if( this == _obj ) return true;
    if(_obj == null || getClass() != _obj.getClass()) return false;
    Animal other = (Animal) _obj;
    return this.name.equalsIgnoreCase(other.name);

   }


    @Override
    public int hashCode() {
        return Objects.hash(type.toLowerCase());
    }

   @Override
    public String toString() {

        return "Animal name: " + name + " Animal age:" + age + " Animal type: " + type;
    }
}
