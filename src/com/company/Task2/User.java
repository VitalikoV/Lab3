package com.company.Task2;

import java.util.Objects;

public class User implements AutoCloseable{
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Address address;

    public User(String firstName, String lastName, String email, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.address = address;
        validate();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void validate(){
       final String regexPattern = "^(.+)@(\\S+)$";
        final String numberRegexPattern = ".*\\d.*";
        if(this.firstName.length() < 3 || this.firstName.length() > 15 || this.firstName.matches(numberRegexPattern)){
            throw new IllegalParamsException("The firstName length can't be less than 3 and bigger than 15 or contain numbers", HttpCodes.HTTP_400);
        }

        if(this.lastName.length() < 3 || this.lastName.length() > 15 || this.lastName.matches(numberRegexPattern)){
            throw new IllegalParamsException("The lastName length can't be less than 3 and bigger than 15 or contain numbers", HttpCodes.HTTP_400);
        }

        if(this.email == null || !this.email.matches(regexPattern)){
            throw new IllegalParamsException("The email must be appropriate type", HttpCodes.HTTP_400);
        }

        if(this.age < 18 || this.age > 100){
            throw new IllegalParamsException("The age must be bigger than 18 and less than 100", HttpCodes.HTTP_400);
        }

        if(this.address == null || !Objects.equals(this.address.getCountry(), "Ukraine")){
            throw new IllegalParamsException("The address must be filled and country must be Ukraine", HttpCodes.HTTP_400);
        }
    }

    @Override
    public void close() throws Exception {
        System.exit(1);
    }
}
