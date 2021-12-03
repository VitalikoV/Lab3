package com.company.Task2;

import java.util.Scanner;

public class SecondTaskService {
    public static void createUser(){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("FirstName: ");
            String firstName = sc.nextLine();
            System.out.print("LastName: ");
            String lastName = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            User user = new User(firstName, lastName, email, age, new Address());
        }catch (IllegalParamsException e){
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Exception code: " + e.getCode().toString());
        }finally {
            sc.close();
        }
    }
}
