package Animals;

public class Animal {
    public String name;
    public Gender gender;
    public Reservor reservedBy;

    public Animal(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

    public String ToString(){
        return "Hallo, mijn naam is ";
    }
}
