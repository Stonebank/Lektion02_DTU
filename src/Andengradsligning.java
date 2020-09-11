import java.util.Scanner;

public class Andengradsligning {

    public static void main(String[] args) {

        System.out.println("Indtast din a værdi");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("a må ikke være 0.");
            return;
        }

        System.out.println("Indtast din b værdi");
        double b = scanner.nextDouble();

        System.out.println("Indtast din c værdi");
        double c = scanner.nextDouble();

        double d = Math.pow(b, 2) - (4 * a * c);
        System.out.println("Diskriminaten er " + d);

        if (d == 0) {
            int x = (int) (-b / (2 * a));
            System.out.println("En løsning er fundet: " + x);
        } else if (d > 0) {
           int x1 = (int) ((-b + Math.sqrt(d)) / 2 * a);
           int x2 = (int) ((-b - Math.sqrt(d)) / 2 * a);
           System.out.println("Andengradsligning har to løsninger, da d er over 0: " + x1 + " " + x2);
        } else {
            System.out.println("Denne andengradsligning har ingen løsninger.");
        }

        scanner.close();

    }

}
