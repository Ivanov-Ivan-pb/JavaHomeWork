package com.pb.ivanov.hv5;

public class Reader {
    public String Ful_name;
    public int Number_ticket;
    public  String Fculty_name;
    public  int Birthday;
    public  int Phone_number;

    Reader(String Ful_name, int Number_ticket, String Fculty_name, int Birthday, int Phone_number ){
        this.Fculty_name=Fculty_name;
        this.Number_ticket=Number_ticket;
        this.Fculty_name=Fculty_name;
        this.Birthday=Birthday;
        this.Phone_number=Phone_number;
    }
    String getInf(){
        return "[Повне імя: " + Fculty_name + ", Номер читацького квитка: " + Number_ticket + ", Факультет: "
                + Fculty_name + ", рік народження: " + Birthday + "Номер телефону:"+Phone_number + "]";
    }

    public  void takeBook(int count){
        System.out.println("Петров В.В. взяв"+ count +"книг");

    }
    public void takeBook(String Name){
        System.out.println("Петров В.В. взяв книги :"+Name+","+Name+","+Name );

    }
    public void takeBook(String Name, String Author, int Year) {
        System.out.println("Петров В.В. взяв книги :" +Name + "("+Author + Year+")");


    }
    public  void returnBook(int count){
        System.out.println("Петров В.В. взяв"+ count +"книг");

    }
    public void returnBook(String Name){
        System.out.println("Петров В.В. взяв книги :"+Name+","+Name+","+Name );

    }
    public void returnBook(String Name, String Author, int Year) {
        System.out.println("Петров В.В. взяв книги :" +Name + "("+Author + Year+")");


    }

}
