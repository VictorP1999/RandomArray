package programm;

import array.Array;

import java.util.Scanner;

/**
 * Created by Victor Penkin on 09.07.2016.
 */
public class Programm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива"+" "+"="+" ");
        int a = scanner.nextInt();
        System.out.println();
        System.out.print("Введите максимальное число массива"+" "+"="+" ");
        int b = scanner.nextInt();
        System.out.println();
        Array.Random(a, b);
    }
}
