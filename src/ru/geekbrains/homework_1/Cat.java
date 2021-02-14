package ru.geekbrains.homework_1;

public class Cat implements Teamable{
    String name = "Кот";
    int maxRunDistance;
    int maxJumpHeight;

    public Cat() {
        this.maxRunDistance = 100;
        this.maxJumpHeight = 25;
    }


    @Override
    public void run(int distance) {
        if (maxRunDistance >= distance) {
            System.out.println(name + " успешно пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
        }


    }

    @Override
    public void jump(int hight) {
        if (maxJumpHeight >= hight) {
            System.out.println(name + " успешно перепрыгнул через  " + hight + " метров.");
        } else {
            System.out.println(name + " не смог перепрыгнуть через " + hight + " метров.");
        }
    }
}
