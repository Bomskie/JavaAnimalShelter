import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;

import java.util.ArrayList;
import java.util.List;

public class Main {

 List<Animal> animals = new ArrayList<Animal>();

 public Main(){
     animals.add(new Dog("Bobby", Gender.male));

     animals.add(new Cat("Twizzle", Gender.female));

     System.out.println(animals.get(0).ToString());
     System.out.println(animals.get(1).ToString());
 }
    public static void main(String[] args){
        new Main();
    }
}
