package org.example.ZadanieSix;
import java.util.Scanner;

public class ZadanieSix {
    public static void main(String[] args) {
        System.out.println(summEl());
    }

    public static int summEl() {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] resArray = null;
        System.out.println("Введите числа массива, после каждого числа нажмите enter. Если хотите завершить ввод, нажмите 0 и enter!");

        String values = new String("");
        String temp = new String("");
        int count = 0;

        while(temp != "0") {
            values += "," + temp;
            temp = sc.nextLine();
            count++;
        }
        String[] str_arr = new String[count];
        int[] arr = new int[count];
        str_arr = values.split(",");
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] =  Integer.parseInt(str_arr[i]);
        }
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }

        return count;

    }
}
