package com.pb.ivanov.hw7;

public class Tshir extends Clothes implements ManClothes, WomenClothes  {


    Tshir(int Size, double Price, String Color) {
        super(Size, Price, Color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
