package com.pb.ivanov.hw7;

public class Tie extends Clothes implements ManClothes, WomenClothes{


    Tie(int Size, double Price, String Color) {
        super(Size, Price, Color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
