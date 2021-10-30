package com.pb.ivanov.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while ( true ) {
            System.out.print("String: ");
            String s = scanner.nextLine();
            if ( "".equals(s) )
                break;
            StringBuilder sb = new StringBuilder(s.length());
            boolean inWord = false;
            for ( char c : s.toCharArray() ) {
                if ( Character.isWhitespace(c) )
                    inWord = false;
                else if ( ! inWord ) {
                    c = Character.toUpperCase(c);
                    inWord = true;
                }
                sb.append(c);
            }

            System.out.println("Result: " + sb.toString());
        }
    }
}
