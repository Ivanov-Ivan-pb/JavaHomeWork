package com.pb.ivanov.hv6;

public class Horse extends  Animal{
    private int Speed;



    public Horse(String Name,String Food, String Location, int Speed) {
        super(Name, Food, Location);
        this.Speed=Speed;
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
        Horse horse = (Horse) o;
        return Speed == horse.Speed;
    }

    @Override
    public int hashCode() {
        return Speed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "Speed=" + Speed +
                '}';
    }
}
