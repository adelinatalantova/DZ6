package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(1889, "Honda", 678.895);
        System.out.println("Год выпуска:" + car1.year + "  Марка:" + car1.brand + "  Цена:" + car1.price);
        car1.condition();

        Car car2 = new Car("Toyota", 567.962, 1999);
        System.out.println("Марка:" + car2.brand + "  Цена:" + car2.price + " Год выпуска:" + car2.year);
        car2.car();


        Car car3 = new Car("Audi", 325.459);
        System.out.println("Марка:" + car3.brand + " Цена:" + car3.price);
        car3.condition("Проблемы с карбюратором");
    }
}
