package ru.geekbrains.homework_1;

public class Human implements Teamable {
    String name = "Человек";
    int maxRunDistance;
    int maxJumpHeight;

    public Human() {
        this.maxRunDistance = 300;
        this.maxJumpHeight = 10;
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
            System.out.println(name + " успешно перепрыгнул через " + hight + " метров.");
        } else {
            System.out.println(name + " не смог перепрыгнуть через " + hight + " метров.");
        }
    }
}
