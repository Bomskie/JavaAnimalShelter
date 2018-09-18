package Animals;

public class Cat extends Animal {
    public Cat(String name, Gender gender) {
        super(name, gender);
    }


    @Override
    public  String toString(){
        //return super.ToString() + super.name + " ik ben een kat";
        return super.toString() + " no bad habits";
    }
}
