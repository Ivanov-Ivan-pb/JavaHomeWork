package com.pb.ivanov.hw4;

import com.pb.ivanov.hv3.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введіть перший рядок");
        String str_1 = scanner.nextLine();
        System.out.println("Введіть другий рядок");
        String str_2=scanner.nextLine();
        if(str_1.length()==str_2.length()){
            char[] Mas_1 = str_1.toCharArray();
            char[] Mas_2=str_2.toCharArray();
            Arrays.sort(Mas_1);
            Arrays.sort(Mas_2);
            boolean result = Arrays.equals(Mas_1, Mas_2);
            if(result){
                System.out.println(str_1 + " І " + str_2 + " Рядки є анаграмами!");
            }
            else{
                System.out.println(str_1 + " І " + str_2 + " Рядки не є анаграмами!");
            }
        }
    }
}
