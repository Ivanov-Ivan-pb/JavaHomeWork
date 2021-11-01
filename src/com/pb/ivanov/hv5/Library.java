package com.pb.ivanov.hv5;

public class Library {
    public static void main(String[] args) {
        Book book=new Book(" Приключения","Сидоров",2000);
        Book book1=new Book(" Словарь","Бабочкин",2005);
        Book book2=new Book(" Стихи","Шевченко",2010);
       // System.out.println(book.getAuthor());
        System.out.println(book.getInfo());
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());

        Reader reader1=new Reader("Ivanov Ivan Ivanovych",654321, "Physical", 2000,974455554);
        Reader reader2=new Reader("Petrov  Vitalii Ivanovych",15589, "Chemical", 1999,934333551);
        Reader reader3=new Reader("Sidorov Stepan Petrovych",344327, "Economic", 2002, 996351254);
        System.out.println(reader1.getInf());
        System.out.println(reader2.getInf());
        System.out.println(reader3.getInf());
        reader1.takeBook(3);
        reader2.takeBook("Приключения");
        reader3.takeBook("Поезія", "Пушкін", 1999);

        reader1.returnBook(3);
        reader2.returnBook("Приключения");
       reader3.returnBook("Поезія", "Гоголь", 1990);

    }

}
