package HomeWork;

import java.util.Scanner;

public class Triangle_T_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", triangleNumber(i));
        iScanner.close();
    }
    public static int triangleNumber(int n) {
        return (n * (n + 1)) / 2;
    }
}