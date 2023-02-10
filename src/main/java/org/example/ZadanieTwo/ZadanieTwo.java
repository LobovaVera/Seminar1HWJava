package org.example.ZadanieTwo;
import java.util.Scanner;
public class ZadanieTwo {
    public static void main(String[] args) {
//    Дана последовательность N целых чисел.
//    Найти количество положительных чисел,
//    после которых следует отрицательное число.

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int num1 = scanner.nextInt();
    int count = 0;
    int num_first = num1;
    for(int i =1; i < n; i++) {
        int num2 = scanner.nextInt();
        if (num_first > 0 && num2 < 0) {
            num_first = num2;
            count++;
        }}


    }
}
