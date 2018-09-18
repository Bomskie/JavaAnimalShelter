package Animals;

public class Animal {
    private final String name;
    private final Gender gender;
    private Reservor reservedBy;

    Animal(String name, Gender gender){
        this.name = name;
        this.gender = gender;
    }

    public String toString(){
        String reservedString = "not reserved";
        if (reservedBy != null){
            reservedString = "Reserved by " + reservedBy.GetName();
        }
        return name + ", " + gender + ", " + reservedString;
    }

    public boolean Reserve(String name){
        if (reservedBy == null){
            reservedBy = new Reservor(name);
            return true;
        }
        return false;
    }
}
