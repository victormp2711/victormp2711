import java.util.Calendar;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        final int julianDay = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);

        UUID uuid1 = UUID.randomUUID();
        System.out.println(uuid1);
        long uuidl2 = uuid1.getLeastSignificantBits();
        System.out.println(uuidl2 + "\n");
        uuid1 = UUID.randomUUID();
        System.out.println(uuid1 + "\n");
        uuidl2 = uuid1.getLeastSignificantBits();
        System.out.println(uuidl2 + "\n");
        uuid1 = UUID.randomUUID();
        System.out.println(uuid1 + "\n");
        uuidl2 = uuid1.getLeastSignificantBits();
        System.out.println(uuidl2 + "\n");
        uuid1 = UUID.randomUUID();
        System.out.println(uuid1 + "\n");
        uuidl2 = uuid1.getLeastSignificantBits();
        System.out.println(uuidl2 + "\n");


// Create a fixed UUID:
       /* String uuidString = "2701447";
        UUID uuid2 = UUID.fromString(uuidString);
        System.out.println(uuid2);*/

// Get string from UUID:
       /* String s = uuid.toString();
        System.out.println(s);
        System.out.println(julianDay);
        System.out.println(julianDay);*/
    }
}
