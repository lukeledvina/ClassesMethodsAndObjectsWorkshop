package com.company;

public class Dog  {

    String name;
    int legs;
    double weight;
    double tailLength;
    String fluffyness;
    boolean whiskers;
    int age;

    public Dog(String name, int legs, double weight, int age) {
        this.name = name;
        this.legs = legs;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public String getFluffyness() {
        return fluffyness;
    }

    public void setFluffyness(String fluffyness) {
        this.fluffyness = fluffyness;
    }

    public boolean isWhiskers() {
        return whiskers;
    }

    public void setWhiskers(boolean whiskers) {
        this.whiskers = whiskers;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
