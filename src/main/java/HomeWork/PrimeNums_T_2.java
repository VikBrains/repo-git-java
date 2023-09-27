package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNums_T_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean PrimeNum = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimeNum = false;
                    break;
                }
            }

            if (PrimeNum) {
                primes.add(i);
            }
        }
        System.out.println("Простые числа: " + primes);
    }
}