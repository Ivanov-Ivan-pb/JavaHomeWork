package com.pb.ivanov.hv3;

import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello Bingo");
        int number;
        int count=0;
        int rand=100;
        number=(int)(Math.random()*rand);
        System.out.println("Вгадайте число від 0 до 100"+rand);
        while(number != rand){
            ++count;
            System.out.println("введіть число");
            number =scanner.nextInt();
            if(number<rand){
                System.out.println("Введене число менше загаданого");

            }
            else if(number>rand){
                System.out.println("Введене число більше від загаданого");
            }
        }
        System.out.println("Ви вгадали число з:"+ count);

    }
}
