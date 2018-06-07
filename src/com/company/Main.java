package com.company;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat("Luke","Jack",4,'m',"GreenSpring",true,12.5);

            System.out.println("THe name of my cat is: " + myCat.getPetName());


            myCat.setWhiskers(true);
            System.out.println("Does this cat have whiskers? " + myCat.isWhiskers());
            System.out.println(myCat.catYears());

    }

    Rabbit myRabbit = new Rabbit("Luke","Whomp",6,'f',"Louisville",1.25,"brown and white");


}



