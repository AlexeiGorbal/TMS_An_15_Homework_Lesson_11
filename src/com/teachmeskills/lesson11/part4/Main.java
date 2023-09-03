package com.teachmeskills.lesson11.part4;

import com.teachmeskills.lesson11.part4.model.Order;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Order> arrayList = new ArrayList<>() {
            {
                add(new Order(9324214, 95.99));
                add(new Order(6532849, 25.90));
                add(new Order(9735572, 85.50));
                add(new Order(4820526, 120));

            }
        };

        System.out.println(arrayList);

        Comparator<Order> comparator = new Comparator<>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Double.compare(o1.getOrderCost(), o2.getOrderCost());
            }
        };

        arrayList.sort(comparator);
        System.out.println(arrayList);
    }
}
