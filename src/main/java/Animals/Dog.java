package Animals;

import java.util.Date;

public class Dog extends Animal {

   // private DateTime lastWalk = new Date();

    public Dog(String name, Gender gender) {
        super(name, gender);
    }

    /*
    public boolean NeedsWalk(){
        Date d = new Date();
        if (){

        }
    }
    */
    @Override
    public  String ToString(){
        return super.ToString() + super.name + " ik ben een hond";
    }
}
