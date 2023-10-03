import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SumEvenCalculator {
    public static int calculateEvenSum(int[] a) {
        int total = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                total += num;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);

            int size = scanner.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = scanner.nextInt();
            }

            scanner.close();

            int evenSum = calculateEvenSum(a);
            System.out.println("Sum of even numbers: " + evenSum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}