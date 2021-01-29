package com.virtusa.sanuka.assignments.string_values;

import java.util.Scanner;

public class StringValueCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;

        System.out.println("Please enter the String : ");
        string = sc.nextLine();
        valueCalculate(string);


    }

    public static void valueCalculate(String string) {

        char[] characters = string.toCharArray();
        String[] firstWord = string.split(" ");
        int value = 0;

        for(char character : characters) {
            if(character == ' ') {
                break;
            }
            switch (character) {
                case 'A':
                    value += 1;
                    break;
                case 'a':
                    value += 1;
                    break;
                case 'B':
                    value += 2;
                    break;
                case 'b':
                    value += 2;
                    break;
                case 'C':
                    value += 3;
                    break;
                case 'c':
                    value += 3;
                    break;
                case 'D':
                    value += 4;
                    break;
                case 'd':
                    value += 4;
                    break;
                case 'E':
                    value += 5;
                    break;
                case 'e':
                    value += 5;
                    break;
                case 'F':
                    value += 6;
                    break;
                case 'f':
                    value += 6;
                    break;
                case 'G':
                    value += 7;
                    break;
                case 'g':
                    value += 7;
                    break;
                case 'H':
                    value += 8;
                    break;
                case 'h':
                    value += 8;
                    break;
                case 'I':
                    value += 9;
                    break;
                case 'i':
                    value += 9;
                    break;
                case 'J':
                    value += 10;
                    break;
                case 'j':
                    value += 10;
                    break;
                case 'K':
                    value += 11;
                    break;
                case 'k':
                    value += 11;
                    break;
                case 'L':
                    value += 12;
                    break;
                case 'l':
                    value += 12;
                    break;
                case 'M':
                    value += 13;
                    break;
                case 'm':
                    value += 13;
                    break;
                case 'N':
                    value += 14;
                    break;
                case 'n':
                    value += 14;
                    break;
                case 'O':
                    value += 15;
                    break;
                case 'o':
                    value += 15;
                    break;
                case 'P':
                    value += 16;
                    break;
                case 'p':
                    value += 16;
                    break;
                case 'Q':
                    value += 17;
                    break;
                case 'q':
                    value += 17;
                    break;
                case 'R':
                    value += 18;
                    break;
                case 'r':
                    value += 18;
                    break;
                case 'S':
                    value += 19;
                    break;
                case 's':
                    value += 19;
                    break;
                case 'T':
                    value += 20;
                    break;
                case 't':
                    value += 20;
                    break;
                case 'U':
                    value += 21;
                    break;
                case 'u':
                    value += 21;
                    break;
                case 'V':
                    value += 22;
                    break;
                case 'v':
                    value += 22;
                    break;
                case 'W':
                    value += 23;
                    break;
                case 'w':
                    value += 23;
                    break;
                case 'X':
                    value += 24;
                    break;
                case 'x':
                    value += 24;
                    break;
                case 'Y':
                    value += 25;
                    break;
                case 'y':
                    value += 25;
                    break;
                case 'Z':
                    value += 26;
                    break;
                case 'z':
                    value += 26;
                    break;
                default:
                    break;

            }
        }
        System.out.println(firstWord[0] + " claculated value is : "+ value);


    }
}
