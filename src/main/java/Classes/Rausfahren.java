package Classes;

import java.time.Duration;
import java.time.LocalDateTime;

public class Rausfahren {

    public boolean darfraus (Ticket ticket) {

        if (Duration.between(ticket.getBezahlDatum(), LocalDateTime.now()).toMinutes() < 15) {
            return true;
        }
else {
    return false;
        }
    }
}