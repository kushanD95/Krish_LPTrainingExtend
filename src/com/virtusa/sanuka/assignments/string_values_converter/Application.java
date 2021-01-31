package com.virtusa.sanuka.assignments.string_values_converter;

import com.virtusa.sanuka.assignments.string_values_converter.exception.StringCannotBeNullException;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string;

        System.out.println("Please enter the String : ");
        string = sc.nextLine();
        try{

            StringValueConverter.valueCalculate(string);

        } catch (StringCannotBeNullException e) {

            System.err.print(e.getMessage());
        }


    }
}
