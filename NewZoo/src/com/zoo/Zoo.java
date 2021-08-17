package com.zoo;

import java.util.ArrayList;

public class Zoo {

    ArrayList<String> animals = new ArrayList<>();

    public ArrayList<String> getAnimals() {
        Dog dog1 = new Dog("Sharik", 2, "male");
        Dog dog2 = new Dog("Ruslan", 3, "male");
        Dog dog3 = new Dog("Svetlana", 1, "female");
        Bird bird1 = new Bird("Ibragim", 2, "male");
        Bird bird2 = new Bird("Natasha", 1, "female");
        Bird bird3 = new Bird("Vlad", 3, "male");

        animals.add(dog1.getName()); // добавить первую собаку по имени
        animals.add(bird3.getName()); // добавить третью птицу по имени
        animals.remove(bird3.getName()); // удалить птицу по имени
        return animals;
    }
}


