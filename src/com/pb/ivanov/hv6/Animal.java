package com.pb.ivanov.hv6;

public class Animal {
    private String Name;
    private String Food;
    private  String Location;

    public Animal(String Name,String Food, String Location){
        this.Name=Name;
        this.Food=Food;
        this.Location=Location;
    }




public String getFood(){

    return  Food;
}
public void setFood(String food){
    this.Food=food;
}
public String getLocation(){
    return Location;
}
public  void setLocation(String Location){

    this.Location=Location;
}

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public  void makeNoice(){
    System.out.println("Noice");
}
    public  void eat(){
        System.out.println("eat");
    }
    public void sleep(){
    System.out.println(Name+"sleep");
    }

}
