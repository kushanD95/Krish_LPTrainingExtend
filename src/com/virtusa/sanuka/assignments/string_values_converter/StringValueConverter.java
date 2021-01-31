package com.virtusa.sanuka.assignments.string_values_converter;

import com.virtusa.sanuka.assignments.string_values_converter.exception.StringCannotBeNullException;

public class StringValueConverter {

    public static void valueCalculate(String string) throws StringCannotBeNullException {

        String valuedElements = "";
        char[] characters = string.trim().toUpperCase().toCharArray();
        int stringValue = 0;
        char character;


        if (characters.length <= 0) {
            throw new StringCannotBeNullException("String cannot be empty");
        }

        for(int i = 0; i < characters.length; i++) {

            if (characters[i] == ' ') {
                break;
            }

            character  = characters[i];

            if(character >=65 && character <= 90) {
                valuedElements += (Character.toString(character));
                stringValue = stringValue + (character - 64);
            }
        }
        System.out.println("value of " + valuedElements + " is : " + stringValue);

    }

}
