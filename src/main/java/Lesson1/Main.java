//import java.util.Scanner;
//
//public class Main    {
//    public static void main(String[] args) {
//        //first();
//        main();
//        // temp();
//        //task0();
//        //   Scanner scanner = new Scanner(System.in);
//        //String name = scanner.nextLine();
//    //System.out.printf("Добрый день "+ name);
//    }
//
//    // Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
//
//    public static void first() {
//
//        int [] arr = new int[] {1,1,1,0,1,1,1};
//        int count = 0;
//        int max = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 1) {
//                count++;
//                if (count > max) {
//                    max = count;
//                }
//            }
//            else{
//                count = 0;
//            }
//
//        }
//        if (count > max) {
//            max = count;
//
//        }
//        System.out.println(max);
//    }
//
//
////    private static void temp() {
////        System.out.println();
////    }
////
////    private static void task0() {
////        System.out.println("Hello!");
////    }
//
//}
//
//}