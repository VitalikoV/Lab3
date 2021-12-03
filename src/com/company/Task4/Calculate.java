package com.company.Task4;

public class Calculate {

    public static void sum(int a1, int a2){
        try {
            System.out.println("Sum of numbers started: "+a1+a2);
            Thread.sleep(1000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("Sum of numbers finished");
    }

    public static void subtract(int a1, int a2){
        System.out.println("subtraction started: "+(a1-a2));
        try {
            Thread.sleep(2000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
            Thread.currentThread().interrupt();
        }
        System.out.println("subtraction finished");
    }

    public static void divide(int a1, int a2){
        if(a2==0){
            throw new ArithmeticException ("Zero can't be divided");
        }
        System.out.println("division: "+(a1/a2));
        try {
            Thread.sleep(3000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("division finished");
    }

    public static void multiply(int a1, int a2){
        try {
            System.out.println("multiplication: "+(a1*a2));
            Thread.sleep(4000);
        } catch (final InterruptedException e){
            System.out.println("Interrupted exception");
        }
        System.out.println("multiplication finished");
    }

}
