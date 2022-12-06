package com.ba.boost.day34.threadexample;

public class Sprinter2 implements Runnable {

	Race race;

	public Sprinter2(Race race) {
		super();
		this.race = race;
	}

	@Override
	public void run() {

		this.race.race();

	}

}
