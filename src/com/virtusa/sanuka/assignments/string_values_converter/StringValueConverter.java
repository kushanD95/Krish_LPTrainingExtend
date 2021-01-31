package com.virtusa.sanuka.assignments.string_values_converter;

import com.virtusa.sanuka.assignments.string_values_converter.exception.StringCannotBeNullException;

public class StringValueConverter {

    public static void valueCalculate(String string) throws StringCannotBeNullException {

        String valuedElements = "";
        char[] characters = string.trim().toCharArray();
        int stringValue = 0;
        char character;


        if (characters.length <= 0) {
            throw new StringCannotBeNullException("String cannot be empty");
        }

        for(int i = 0; i < characters.length; i++) {

            if (characters[i] == ' ') {
                break;
            }

            character  = Character.toUpperCase(characters[i]);

            if(character >= 'A' && character <= 'Z') {
                valuedElements += (Character.toString(characters[i]));
                stringValue = stringValue + (character - ('A' - 1));
            }
        }
        System.out.println("value of " + valuedElements + " is : " + stringValue);

    }

}
