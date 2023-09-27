/* Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
(возвращает boolean значение).*/
package Lesson_2;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        StringBuilder notReverse = new StringBuilder(name.nextLine());
        StringBuilder reverseName = new StringBuilder(notReverse.reverse());
        boolean equals = notReverse.toString().equals(reverseName.toString());
        if (equals) {
            System.out.println("Палиндром");

        }
        else System.out.println("Не палиндром");

    }
}


