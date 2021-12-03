package com.company.Task2;

import java.util.Scanner;

public class SecondTaskService {
    public static void createUser() throws Exception {
        User user = null;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("FirstName: ");
            String firstName = sc.nextLine();
            System.out.print("LastName: ");
            String lastName = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            user = new User(firstName, lastName, email, age, new Address());
        } catch (IllegalParamsException e) {
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Exception code: " + e.getCode().toString());
        }finally {
            user.close();
        }
    }
}
