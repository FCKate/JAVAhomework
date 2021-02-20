/*Создать классы Собака и Кот с наследованием от класса Животное.
Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом
 выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
собака 10 м.).
* Добавить подсчет созданных котов, собак и животных.
*/
package ru.geekbrains.homework.sixth;

import java.util.Scanner;

public class Animal {
    String kind;
    String name;
    protected int maxRun = 1000;
    protected int maxSwim = 100;
    protected static int counter;


    public Animal() {
        
    }

    public Animal(String kind, String name) {
        this.kind = kind;
        this.name = name;

        counter++;

    }

    public void animalInfo() {
        System.out.println(kind + " " + name);
    }

    public static int getCounter() {
        return counter;
    }


    int customizeRun() {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + " пробежит (введите дистанцию):");
        while (true) {
            boolean distance = false;
            int run = sc.nextInt();
            if(run <= maxRun) {
                distance = true;
                return run;
            } else {
                System.out.print("Максимум который может пробежать " + name + " - " + maxRun + "m.\nвведите дистанцию:");
            }
        }
    }

    int customizeSwim() {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + " проплывет (введите дистанцию):");
        while (true) {
            boolean distance = false;
            int swim = sc.nextInt();
            if(swim <= maxSwim) {
                distance = true;
                return swim;
            } else {
                System.out.print("Максимум который может пробежать " + name + " - " + maxRun + "m.\nвведите дистанцию:");
            }
        }
    }

    public void customize() {
        int run = customizeRun();
        int swim = customizeSwim();
        System.out.println(kind + " по имени " + name + " пробежал " + run + "m и проплыл " + swim + "m\n");
    }
}

