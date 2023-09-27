//mport java.util.Scanner;
//
//public class ThirdTask {
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите строку");
//        String input = in.nextLine();
//        boolean flag = true;
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) != ' ') {
//                stringBuilder.append(input.charAt(i));
//            }
//        }
//        stringBuilder.toString();
//        for (int i = 1; i < stringBuilder.length() / 2; i++) {
//            if (stringBuilder.charAt(i) != stringBuilder.charAt(stringBuilder.length() - i - 1)) {
//                flag = false;
//            }
//        }
//        if (flag) {
//            System.out.println("Данная строка является палиндромом");
//        } else {
//            System.out.println("Данная строка НЕ является палиндромом");
//        }
//    }
//}
