package com.company;

public class Cat extends Pet {

    String name;
    boolean whiskers;
    boolean fur;
    int legs;
    double weight;
    String furColor;

    public Cat(String ownerName, String petName, int age, char gender, String homeAddress, boolean fur, double weight) {
        super(ownerName, petName, age, gender, homeAddress);
        this.fur = fur;
        this.weight = weight;
    }

//    public Cat(String ownerName, String petName, int age, char gender, String homeAddress) {
//        super(ownerName, petName, age, gender, homeAddress);
//    }

//        public Cat(String name, int legs, double weight) {
//        this.name = name;
//        this.legs = legs;
//        this.weight = weight;

//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public boolean isWhiskers() {
        return whiskers;
    }

    public void setWhiskers(boolean whiskers) {
        this.whiskers = whiskers;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
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

    public String getFurColor() {
        return furColor;
    }


    @Override
    protected String makeSound() {
        return "MEOOOOOW";
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    protected String catYears () {

        int catYears;

        switch (super.getAge()) {
            case 0: catYears = 0; break;
            case 1: catYears = 19; break;
            case 2: catYears = 24; break;
            default: catYears = (super.getAge() - 2) * 4 + 24;



        }
        return super.getPetName() + " is " + super.getAge() + " human years old and " + catYears + " cat years old.";

    }
}

