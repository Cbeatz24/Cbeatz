package com.zoo;

public class ZooApplication {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        System.out.println(zoo.getAnimals()); //
        System.out.println(zoo.animals.size()); // количество животных в зоопарке
    }
}
