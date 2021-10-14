package com.pb.ivanov.hv2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first operand");
        int operand1 = scanner.nextInt();
        System.out.println(operand1 + "First number");
        System.out.println("Enter second operand");
        int operand2 = scanner.nextInt();
        System.out.println(operand2 + "Second number");
        System.out.println("Choose an operation +, -, /, *");
        char sign;
        sign = scanner.next().charAt(0);
        int res;
        switch (sign) {
            case '+':
                res = operand1 + operand2;
                break;
            case '-':
                res = res = operand1 - operand2;
                break;
            case '/':
                res = res = operand1 / operand2;
                break;
            case '*':
                res = res = operand1 * operand2;
                break;

        }

    }

}
