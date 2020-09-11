import java.util.Scanner;

public class KonvertionAfSekunder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();

        int days = seconds / 86400;
        int hours = seconds % 86400 / 3600;
        int minutes = seconds % 3600 / 60;
        int seconds2 = seconds % 60;

        System.out.println(seconds + " seconds equals " + days + " days, " + hours + " hours," + " " + minutes + " minutes and " + seconds2 + " seconds.");

        scanner.close();

    }

}
