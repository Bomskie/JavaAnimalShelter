package Animals;

import java.time.LocalDateTime;

public class Reservor {
    private final String name;
    private final LocalDateTime reservedAt;

    public Reservor(String naam){
        name = naam;
        reservedAt = LocalDateTime.now();
    }

    public String GetName(){return name;}
}
