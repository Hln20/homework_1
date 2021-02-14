package ru.geekbrains.homework_1;

public class Wall implements Obstacable{
    public int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void gothroughit(Teamable t) {
        t.jump(height);

    }
}
