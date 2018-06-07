package com.company;

public class Rabbit extends Pet {

    double tailLength;
    String furColor;
    String eyeColor;
    String breed;

    public Rabbit(String ownerName, String petName, int age, char gender, String homeAddress, double tailLength, String furColor) {
        super(ownerName, petName, age, gender, homeAddress);
        this.tailLength = tailLength;
        this.furColor = furColor;
        this.eyeColor = eyeColor;
        this.breed = breed;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

