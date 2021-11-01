package com.pb.ivanov.hv5;

public class Book {
    public String Name;
    public String Author;
    public int Year;

    Book(String Name, String Author, int Year){
        this.Name=Name;
        this.Author=Author;
        this.Year=Year;

    }
    String getInfo(){
        return  "[Назва: " + Name + ", Автор: " + Author + ", рік: "
                + Year + "]";
    }



}
