package zoo;

import java.util.Comparator;
import java.util.Objects;


public class Animal{

    protected String name;
    protected int age;
    protected String type;
    protected int priority;

    //comparators
    public static final Comparator<Animal> BY_NAME = 
        Comparator.comparing( a -> a.name.toLowerCase());

    public static final Comparator<Animal> BY_AGE =
        Comparator.comparing( a -> a.age);

    public static final Comparator<Animal> BY_TYPE = 
        Comparator.comparing(a -> a.type.toLowerCase());

    public static final Comparator<Animal> BY_PRIORITY =
        Comparator.comparing(a -> a.priority);

    public Animal() {
        this.name = "Unknown";
        this.age = 0;
        this.type = "Unknown";
        this.priority = 0;

    }

    public Animal(String _name, int _age, String _type, int _priority ){

        this.name = _name;
        this.age = _age;
        this.type = _type;
        this.priority = _priority;

    }

    public Animal(Animal _other) {
        this.name = _other.name;
        this.age = _other.age;
        this.type = _other.type;
        this.priority = _other.priority;
    }

    public String getName() { return name;}
    public int getAge() {return age;}
    public String getType() { return type;}
    public int getPriority() { return priority;}



    public void setName(String _name) { this.name = _name;}
    public void setAge(int _age) { this.age = _age;}
    public void setType(String _type) { this.type = _type; }
    public void setPriority(int _priority) {this.priority = _priority;}


   @Override
   public boolean equals(Object _obj) {
    if( this == _obj ) return true;
    if(_obj == null || getClass() != _obj.getClass()) return false;
    Animal other = (Animal) _obj;
    return this.priority == other.priority;

   }


    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }

   @Override
    public String toString() {

        return "Animal name: " + name + " Animal age:" + age + " Animal type: " + type +" priority: "+ priority;
    }
}
