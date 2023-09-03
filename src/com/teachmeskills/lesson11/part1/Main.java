package com.teachmeskills.lesson11.part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

       enteringNumbers(arrayList);
        outputOfEvenNumbers(arrayList);
    }

    public static void outputOfEvenNumbers(ArrayList arrayList) {
        ArrayList<Integer> array = new ArrayList<>();

        for (Object o : arrayList) {
            int list = (int) o;
            if (list % 2 == 0) {
                array.add(list);
            }
        }

        System.out.println(array);
    }

    public static void enteringNumbers(ArrayList arrayList) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        try {
            while (scanner.hasNext()) {
                String str = scanner.next();
                if (str.toLowerCase().equals("exit")) {
                    break;
                }
                int i = Integer.parseInt(str, 10);
                arrayList.add(i);

            }
        } catch (NumberFormatException e) {
            throw e;
        }

        System.out.println(arrayList);
    }
}