package Animals;

import java.time.LocalDateTime;

public class Reservor {
    public String name;
    public LocalDateTime reservedAt;

    public Reservor(String naam){
        name = naam;
        reservedAt = LocalDateTime.now();
    }
}
