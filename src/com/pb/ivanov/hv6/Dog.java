package com.pb.ivanov.hv6;

import javax.naming.Name;

public class Dog extends Animal {

    private int Height;


    public Dog(String Name,String Food, String Location, int Height) {
        super(Name, Food, Location);
        this.Height=Height;

    }
    @Override
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

        Dog dog = (Dog) o;

        return Height == dog.Height;
    }

    @Override
    public int hashCode() {
        return Height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Height=" + Height +
                '}';
    }
}
