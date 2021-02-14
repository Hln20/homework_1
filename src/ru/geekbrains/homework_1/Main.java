package ru.geekbrains.homework_1;

public class Main {

	public static void main(String[] args) {
		Teamable[] team = {
				new Human(),
				new Cat(),
				new Robot(),
		};

		Obstacable[] obstacles = {
				new Racetrack(1000),
				new Wall(20),
		};

		for (Teamable t : team) {
			for (Obstacable o: obstacles){
				o.gothroughit(t);
			}


			}
		}
	}
