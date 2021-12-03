package com.company.Task1;

public class FirstTaskService {
    public static void createUser(){
        try {
            User user = new User("Testing", "Testing", "test@test.com", 200, new Address());
        }catch (IllegalParamsException e){
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Exception code: " + e.getCode().toString());
        }
    }
}
