package com.teachmeskills.lesson11.part4.model;

public class Order {
    private int id;
    private double orderCost;

    public Order(int id, double orderCost) {
        this.id = id;
        this.orderCost = orderCost;
    }

    public double getOrderCost() {
        return orderCost;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderCost=" + orderCost +
                '}';
    }
}
