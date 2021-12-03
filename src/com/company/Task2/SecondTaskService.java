package com.company.Task2;

import java.util.Scanner;

public class SecondTaskService {
    public static void createUser() throws Exception {
        try (User user = new User()){
            Scanner sc = new Scanner(System.in);
            System.out.print("FirstName: ");
            String firstName = sc.nextLine();
            user.setFirstName(firstName);
            System.out.print("LastName: ");
            String lastName = sc.nextLine();
            user.setLastName(lastName);
            System.out.print("Email: ");
            String email = sc.nextLine();
            user.setEmail(email);
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());
            user.setAge(age);
        } catch (IllegalParamsException e) {
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Exception code: " + e.getCode().toString());
        }
    }
}
