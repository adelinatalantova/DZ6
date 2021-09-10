package com.company;

public class Car {
    int year;
    String brand;
    double price;

    public Car(int year,String brand,double price){
        this.year = year;
        this.brand = brand;
        this.price = price;
    }

    public Car (String brand,double price,int year){
        this.brand = brand;
        this.price = price;
        this.year = year;
    }

    public Car (String brand,double price){
        this.brand = brand;
        this.price = price;
    }

      public void condition(){
          System.out.println("Отличное состояние!");
      }
      public void condition(String condition){
          System.out.println(condition);
      }
     public void car (){
         System.out.println("Есть царапины");
     }

}
