import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;

import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private List<Animal> animals;

    public Reservation(){animals = new ArrayList<Animal>();}

    public List<Animal> GetAnimals(){return animals;}

    public void NewCat(String name, Gender gender){animals.add(new Cat(name, gender));}
    public void NewDog(String name, Gender gender){animals.add(new Dog(name, gender));}
}
