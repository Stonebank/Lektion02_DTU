import java.util.Scanner;

public class AfstandLinjePunkt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();

        System.out.println((a * x0 - y0 + b) / Math.sqrt(1 + Math.pow(a, 2)));

        scanner.close();

    }

}
