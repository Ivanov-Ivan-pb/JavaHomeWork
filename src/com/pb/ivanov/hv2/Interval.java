package com.pb.ivanov.hv2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x;
        System.out.println("Введіть число");
        x = scanner.nextInt();
        if(x>=0 && x<=14){
            System.out.println("Число знаходиться в інтервалі [1-14]");
        }
        else if(x>=15 && x<=35){
            System.out.println("Число знаходиться в інтервалі [15-35]");
        }
        else if(x>=36 && x<=50){
            System.out.println("Число знаходиться в інтервалі [36-50]");
        }
        else if(x>=51 && x<=100){
            System.out.println("Число знаходиться в інтервалі [51-100]");
        }
        else{
            System.out.println("Число не належить жодному інтервалу");

        }
    }
}
