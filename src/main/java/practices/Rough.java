package practices;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

public class Rough {
    public static void main(String[] args) {
        Date dt = new Date();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(dt.getTime());
        System.out.println(System.currentTimeMillis());
    }
}
