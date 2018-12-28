package com.example.user.myapplication;

// Class for contact address
public class ContactAddress {

    String name;
    String number;
    int imgId;

    public ContactAddress(String name, String number, int imgId){
        this.name = name;
        this.number = number;
        this.imgId = imgId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setImgId(int imgId){
        this.imgId = imgId;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    public int getImgld(){
        return imgId;
    }
}
