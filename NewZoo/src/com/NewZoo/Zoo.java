package com.NewZoo;

public class Zoo {

    public static void main(String[] args) {
        System.out.println("Собаки в зоопарке:");
        Dogs dogs = Dogs.DOG1;
        System.out.println("Имя: " + dogs.getИмя() + " " + "Возраст: " + dogs.getВозраст() + " " + "Пол: " + dogs.getПол());
        Dogs dogs1 = Dogs.DOG2;
        System.out.println("Имя: " + dogs1.getИмя() + " " + "Возраст: " + dogs1.getВозраст() + " " + "Пол: " + dogs1.getПол());
        Dogs dogs2 = Dogs.DOG3;
        System.out.println("Имя: " + dogs2.getИмя() + " " + "Возраст: " + dogs2.getВозраст() + " " + "Пол: " + dogs2.getПол());

        System.out.println("Птички в зоопарке:");
        Birds birds = Birds.BIRD1;
        System.out.println("Имя: " + birds.getИмя() + " " + "Возраст: " + birds.getВозраст() + " " + "Пол: " + birds.getПол());
        Birds birds1 = Birds.BIRD2;
        System.out.println("Имя: " + birds1.getИмя() + " " + "Возраст: " + birds1.getВозраст() + " " + "Пол: " + birds1.getПол());
        Birds birds2 = Birds.BIRD3;
        System.out.println("Имя: " + birds2.getИмя() + " " + "Возраст: " + birds2.getВозраст() + " " + "Пол: " + birds2.getПол());
    }
}
