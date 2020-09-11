import java.util.Scanner;

public class TjekPassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast et password som ønskes at blive kontrolleret:");

        String password = scanner.nextLine();

        if (password.length() < 5) {
            System.out.println("Password er for kort.");
            return;
        }

        if (password.length() > 8) {
            System.out.println("Password er for langt.");
            return;
        }

        System.out.println("Password er fin.");

    }

}
