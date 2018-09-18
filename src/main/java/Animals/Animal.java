package Animals;

public class Animal {
    private String name;
    private Gender gender;
    private Reservor reservedBy;

    public Animal(String name, Gender gender){
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
}
