package com.virtusa.sanuka.design_patterns.builder;

public class Application {
    public static void main(String[] args) {

        //builder for Saman
        Employee.Builder builder = new Employee.Builder("Saman");
        //Saman
        Employee empOne = builder.email("abc@mail.com").age(25).mobileNumber(1234567809).build();
        System.out.println("___________________Saman___________________");
        System.out.println(empOne);

        //builder for Kamal
        Employee.Builder builder1 = new Employee.Builder("Kamal");
        //Kamal
        Employee empTwo = builder1.email("def@mail.com").age(25).mobileNumber(1234567809).build();
        System.out.println("___________________Kamal___________________");
        System.out.println(empTwo);

        //must use individual builders
    }
}
