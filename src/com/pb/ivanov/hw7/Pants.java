package com.pb.ivanov.hw7;

public class Pants  extends Clothes implements ManClothes, WomenClothes {


    Pants(int Size, double Price, String Color) {
        super(Size, Price, Color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
