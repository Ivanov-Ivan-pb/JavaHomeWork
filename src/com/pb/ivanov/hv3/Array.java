package com.pb.ivanov.hv3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив");
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt();
        }
        System.out.println("Заполненый массив");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");
        }
        System.out.println();
        int sum_el=0;
        for(int i=0;i<mas.length;i++){
            sum_el+=mas[i];
        }
        System.out.println("Сума елементів масиву :" + sum_el);
        System.out.println();
        int poz_el=0;
        for(int i=0;i<mas.length;i++){
            if(mas[i]>0){
                poz_el++;
            }
        }
        System.out.println("Кількість додатніх елементів масиву :" + poz_el);
        System.out.println();
        int tmp;
        for(int i=0;i<mas.length-1;i++){
            if(mas[i]>mas[i+1]){
                tmp=mas[i];
                mas[i]=mas[i+1];
                mas[i+1]=tmp;

            }
        }
        System.out.println("Сортування за зростанням");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");
        }
        for(int i=0;i<mas.length-1;i++){
            if(mas[i]<mas[i+1]){
                tmp=mas[i];
                mas[i]=mas[i+1];
                mas[i+1]=tmp;

            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Сортування за спаданням");
        for (int i=0;i < mas.length;i++){
            System.out.print(mas[i]+ " ");
        }
    }
}
