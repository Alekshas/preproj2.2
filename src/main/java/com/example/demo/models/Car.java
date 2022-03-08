package com.example.demo.models;

public class Car {
    private String name;
    private int maxSpeed;
    private int weight;

    public Car(String name, int maxSpeed, int weight) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }
}
