package com.teachmeskills.lesson11.part3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = collectionSizeInput();

        ArrayList<Integer> arrayList = new ArrayList<>(size);

        populationAndOutputtingACollection(arrayList, size);

        double sum = 0;
        for (Integer integer : arrayList) {
            sum += integer;
        }
        System.out.println("Arithmetic mean of collection elements: " + (sum / size));
    }

    public static void populationAndOutputtingACollection(ArrayList arrayList, int size) {
        for (int i = 0; i < size; i++) {
            arrayList.add((int) (Math.random() * 100));
        }

        System.out.println(arrayList);
    }

    public static int collectionSizeInput() {
        Scanner sc = new Scanner(System.in);

        int size = 0;
        try {
            System.out.print("Print size list: ");
            size = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You entered a string, not a number.");
        } catch (IllegalArgumentException e) {
            System.out.println("You cant create a collection with that size.");
        }

        return size;
    }
}

