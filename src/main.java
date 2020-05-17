import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        final int VALID_PIN = 1234;
        int scannedPin = 0;
        int p1 = System.in.read();
        int p2 = System.in.read();
        int p3 = System.in.read();
        int p4 = System.in.read();

        System.out.println(p1 + " " + p2 + " " + p3 + " " + p4);
        scannedPin=(Character.getNumericValue(p1)*1000)+(Character.getNumericValue(p2)*100) +(Character.getNumericValue(p3)*10) +Character.getNumericValue(p4);
        System.out.println(scannedPin);

        if (VALID_PIN == scannedPin) {
            System.out.println("Account accessible? true");
        } else
            System.err.println("Account accessible? false");

    }
}
