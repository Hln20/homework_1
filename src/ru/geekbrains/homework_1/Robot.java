package ru.geekbrains.homework_1;

public class Robot implements Teamable{
    String name = "Робот";
    int maxRunDistance;
    int maxJumpHeight;

    public Robot() {
        this.maxRunDistance = 1000;
        this.maxJumpHeight = 15;
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
            System.out.println(name + " успешно прыгнул на " + hight + " метров.");
        } else {
            System.out.println(name + " не смог перепрыгнуть через " + hight + " метров.");
        }
    }
}
