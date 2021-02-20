package ru.geekbrains.homework.sixth;

public class Cat extends Animal {
    protected int maxRun;

    public Cat(String kind, String name) {
        super(kind, name);
        super.maxRun = 200;
    }

    @Override
    public void customize() {
        int run = customizeRun();
        System.out.println(kind + " по имени " + name + " пробежал " + run + "m, плавать кот не умеет (хотя " +
                "непотопляемый Сэм с вами поспорит)\n");
    }
}
