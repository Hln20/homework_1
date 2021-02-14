package ru.geekbrains.homework_1;

public class Racetrack implements Obstacable{
 public int distance;

 public Racetrack (int distance){
     this.distance = distance;
 }

    @Override
    public void gothroughit(Teamable t) {
        t.run(distance);

    }
}
