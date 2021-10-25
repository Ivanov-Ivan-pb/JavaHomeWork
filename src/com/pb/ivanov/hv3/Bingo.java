package com.pb.ivanov.hv3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello Bingo");
        int number;
        int count=0;
        int rand=100;
        int exit=999;
        number=(int)(Math.random()*rand);
        System.out.println("Вгадайте число від 0 до 100"+rand);
        System.out.println("Для закінчення гри введіть 999");
        //++count;
        while(number != rand){
            if(number==exit){
                System.out.println("Гру завершено");
                break;
            }
            ++count;
            System.out.println("введіть число");
            number =scanner.nextInt();
            //++count;
            if(number<rand){
                System.out.println("Введене число менше загаданого");
            }
            if(number>rand){
                System.out.println("Введене число більше від загаданого");
            }
            if(number==rand){
                System.out.println("Ви вгадали число з:"+ count +"разу");
            }
        }
    }
}





