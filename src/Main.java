import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6};
        numberOperations();
//        stringComparison();
//        getEvenNumbersFromArray(numbersArray);
    }

    public static void numberOperations() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int x = in.nextInt();
        System.out.println();
        System.out.print("Введите второе число:");
        int y = in.nextInt();
        System.out.println("x * y = " + x*y);
        System.out.println("x / y = " + x/y);
        System.out.println("x + y = " + (x+y));
        System.out.println("x - y = " + (x-y));
        if (x > y) {
            System.out.println("x > y");
        } else if (x < y) {
            System.out.println("x < y");
        } else {
            System.out.println("x = y");
        }
    }

//    public static void stringComparison() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите первую строку");
//        String a = in.nextLine();
//        System.out.println("Введите вторую строку");
//        String b = in.nextLine();
//        if (a.equals(b)) {
//            System.out.println("Строки идентичны");
//        } else System.out.println("Строки не идентичны");
//    }
//
//    public static void getEvenNumbersFromArray(int [] seqArray) {
//        for (int element : seqArray) {
//            if (element % 2 == 0) {
//                System.out.println(element);
//            }
//        }
//    }
}