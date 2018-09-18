package Animals;

public class Cat extends Animal {
    public Cat(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public  String ToString(){
        return super.ToString() + super.name + " ik ben een kat";
    }
}
