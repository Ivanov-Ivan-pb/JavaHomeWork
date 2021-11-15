package com.pb.ivanov.hw7;

import com.sun.glass.ui.Size;

public class Atelier {
    public static void main(String[] args) {
        Tshir tshir1=new Tshir(32, 650, "Red");
        Pants pants1=new Pants(36, 500, "Brown" );
        Skirt skirt1=new Skirt(38, 700, "White");
        Tie tie1=new Tie(40, 400, "Black");


        Clothes clothes[]={tshir1, pants1, skirt1, tie1};

        static void dressMan (Clothes[] clothes) {
            System.out.println("Мужская одежда:");
            for (Clothes clothe : clothes) {
                if (clothe instanceof ManClothes) {
                    ((ManClothes) clothe).dressMan();
                }
            }

            static void  dressWomen (Clothes[] clothes) {
                System.out.println("Женская одежда:");
                for (Clothes clothe1 : clothes) {
                    if (clothe instanceof WomenClothes) {
                        ((ManClothes) clothe).dressWomen();
                    }
                }








    }
}
