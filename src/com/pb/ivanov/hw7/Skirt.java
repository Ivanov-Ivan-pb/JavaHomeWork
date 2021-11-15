package com.pb.ivanov.hw7;

public class Skirt extends Clothes implements ManClothes, WomenClothes {


    Skirt(int Size, double Price, String Color) {
        super(Size, Price, Color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
