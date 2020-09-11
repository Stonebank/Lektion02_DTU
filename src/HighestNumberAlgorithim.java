public class HighestNumberAlgorithim {

    public static void main(String[] args) {
        int[] numberArray = new int[] { 2, 3, 7, 9, 2, 1, 5 };
        int tempMax = 0;

        for (int number : numberArray) {
            if (number > tempMax)
                tempMax = number;
        }

        System.out.println("Maksimum number: " + tempMax);

    }

}
