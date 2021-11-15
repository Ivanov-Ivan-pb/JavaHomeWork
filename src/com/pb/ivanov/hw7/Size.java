package com.pb.ivanov.hw7;

public enum Size {
    XXS("Детский размер",32),
    XS("Взрослый размер",34),
    S("Взрослый размер",36),
    M("Взрослый размер",38),
    L("Взрослый размер",40);

    private int euroSize;
    private String Description;
    Size(String Description,  int euroSize){
        this.Description=Description;
        this.euroSize=euroSize;


    }
    public String getDescription(){
        return Description;

    }
    public int getEuroSize(){
       return euroSize;

    }
    @Override
    public String toString(){
        return Description;
    }
}

