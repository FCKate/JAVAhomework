package ru.geekbrains.homework.sixth;

public class Dog extends Animal {
    protected int maxRun;
    protected int maxSwim;

    public Dog(String kind, String name) {
        super(kind, name);
        super.maxRun = 500;
        super.maxSwim = 10;
    }
}
