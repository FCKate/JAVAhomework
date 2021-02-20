package ru.geekbrains.homework.sixth;

public class Sixth {

    public static void main(String[] args) {
        System.out.println("Sixth homework\n");

        Animal animal = new Animal("Пес", "Барбос");
        animal.animalInfo();
        animal.customize();

        Cat cat = new Cat ("Кот", "Муся");
        cat.animalInfo();
        cat.customize();

        Dog dog = new Dog("Пес", "Бобик");
        dog.animalInfo();
        dog.customize();

    }
}
