package Animals;

import java.time.LocalDateTime;

public class Reservor {
    private String name;
    private LocalDateTime reservedAt;

    public Reservor(String naam){
        name = naam;
        reservedAt = LocalDateTime.now();
    }

    public String GetName(){return name;}
}
