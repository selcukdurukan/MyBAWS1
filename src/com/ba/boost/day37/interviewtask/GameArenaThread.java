package com.ba.boost.day37.interviewtask;

public class GameArenaThread extends Thread {

	private static final int FINISH_POINT = 5000;
	private static int gameMeter = 0;
	private static Hero hero = Hero.getInstance();
	private static final int gameDuration = 500;

	@Override
	public void run() {
		System.out.println("Welcome to game...");
		System.out.println("Resources are 5000 metres away.... Therefore, you have to go and take them.");
		System.out.println("However, you should careful because some dangerous enemies can be in these 5000 metres.");
		System.out.println();

		try {
			goAhead();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private void fightWithBug() throws InterruptedException {
		Bug bug = new Bug();
		System.out.println();
		System.out.println("At " + gameMeter + " Look at the bug!!! It's dangerous enemy!! There will be fight");
		while (true) {
			hero.setHp(hero.getHp() - bug.getAttack());
			bug.setHp(bug.getHp() - hero.getAttack());
			Thread.sleep(gameDuration);
			if (hero.getHp() % 10 == 0) {
				System.out.println("Your Hero HP: " + hero.getHp());
				System.out.println("Bug HP: " + bug.getHp());
				if (hero.getHp() <= 0 || bug.getHp() <= 0) {
					break;
				}
			}
		}
		Thread.sleep(gameDuration);
		if (hero.getHp() > 0) {
			System.out.println("We have won. There are " + (FINISH_POINT - gameMeter) + " for finish.");
		} else {
			System.out.println("Hero couldn't survive :(");
		}
		System.out.println();

	}

	private void goAhead() throws InterruptedException {
		for (gameMeter = 0; gameMeter <= FINISH_POINT; gameMeter++) {
			if (hero.getHp() <= 0) {
				System.out.println("Game Finish.");
				return;
			}
			if (gameMeter % 100 == 0) {
				System.out.println("Your hero is at " + gameMeter + " metres away from start point.....");
				Thread.sleep(gameDuration);
				if (gameMeter == FINISH_POINT) {
					System.out.println();
					System.out.println("HERO SURVIVED. YOU HAVE WON!!");
				}
			}
			if (gameMeter == 276) {
				fightWithBug();
			}
			if (gameMeter == 489) {
				fightWithBug();
			}
			if (gameMeter == 1527) {
				fightWithLion();
			}
			if (gameMeter == 1681) {
				fightWithZombie();
			}
			if (gameMeter == 2865) {
				fightWithLion();
			}
			if (gameMeter == 3523) {
				fightWithZombie();
			}

		}

	}

	private void fightWithZombie() throws InterruptedException {
		Zombie zombie = new Zombie();
		System.out.println();

		System.out.println("At " + gameMeter + " Look at the Zombie!!! It's dangerous enemy!! There will be fight");
		while (true) {
			hero.setHp(hero.getHp() - zombie.getAttack());
			zombie.setHp(zombie.getHp() - hero.getAttack());
			Thread.sleep(gameDuration);
			if (hero.getHp() % 10 == 0) {
				System.out.println("Your Hero HP: " + hero.getHp());
				System.out.println("Zombie HP: " + zombie.getHp());
				if (hero.getHp() <= 0 || zombie.getHp() <= 0) {
					break;
				}
			}
		}
		Thread.sleep(gameDuration);
		if (hero.getHp() > 0) {
			System.out.println("We have won. There are " + (FINISH_POINT - gameMeter) + " for finish.");
		} else {
			System.out.println("Hero couldn't survive :(");
		}
		System.out.println();

	}

	private void fightWithLion() throws InterruptedException {
		Lion lion = new Lion();
		System.out.println();

		System.out.println("At " + gameMeter + " Look at the lion!!! It's dangerous enemy!! There will be fight");
		while (true) {
			hero.setHp(hero.getHp() - lion.getAttack());
			lion.setHp(lion.getHp() - hero.getAttack());
			Thread.sleep(gameDuration);
			if (hero.getHp() % 10 == 0) {
				System.out.println("Your Hero HP: " + hero.getHp());
				System.out.println("Lion HP: " + lion.getHp());
				if (hero.getHp() <= 0 || lion.getHp() <= 0) {
					break;
				}
			}
		}
		Thread.sleep(gameDuration);
		if (hero.getHp() > 0) {
			System.out.println("We have won. There are " + (FINISH_POINT - gameMeter) + " for finish.");
		} else {
			System.out.println("Hero couldn't survive :(");
		}
		System.out.println();

	}

}
