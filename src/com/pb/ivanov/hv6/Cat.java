package com.pb.ivanov.hv6;

import java.util.Objects;

public class Cat extends Animal {
    private int weight;

    public Cat(String Name,String Food, String Location, int weight) {
        super(Name, Food,  Location);
        this.weight=weight;
    } @Override
    public  void makeNoice(){
        System.out.println(getName()+"Noice");
        super.makeNoice();
    }
    @Override
    public  void eat(){
        System.out.println(getName()+"eat");
        super.eat();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return weight == cat.weight;
    }

    @Override
    public int hashCode() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
