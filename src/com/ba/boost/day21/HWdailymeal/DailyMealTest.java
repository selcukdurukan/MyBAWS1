package com.ba.boost.day21.HWdailymeal;

import java.util.ArrayList;
import java.util.LinkedList;

public class DailyMealTest {

	private static LinkedList<String> mainMeals = new LinkedList<>();
	private static LinkedList<String> sideMeals = new LinkedList<>();
	private static ArrayList<String> days = new ArrayList<>();

	public static void main(String[] args) {

		DailyMealTest obj = new DailyMealTest();
		obj.addDays();
		System.out.println(DailyMealTest.days);

		obj.addMainMeals();
		System.out.println(DailyMealTest.mainMeals);

		obj.addSideMeals();
		System.out.println(DailyMealTest.sideMeals);
		
		System.out.println();
		

		obj.createMenu();
		
		System.out.println();
		System.out.println(DailyMealTest.mainMeals);
		System.out.println(DailyMealTest.sideMeals);

	}

	private void createMenu() {
		int randomMainNumber = DailyMealTest.mainMeals.size();
		int randomSideNumber = DailyMealTest.mainMeals.size();
		for (int i = 0; i < DailyMealTest.days.size(); i++) {
			int tempMainCount = (int) (Math.random() * randomMainNumber);
			int tempSideCount = (int) (Math.random() * randomSideNumber);
			randomMainNumber--;
			randomSideNumber--;
			System.out.println(DailyMealTest.days.get(i) + " - " + DailyMealTest.mainMeals.get(tempMainCount) + ", "
					+ DailyMealTest.sideMeals.get(tempSideCount));
			DailyMealTest.mainMeals.remove(tempMainCount);
			DailyMealTest.sideMeals.remove(tempSideCount);
		}
	}

	private void addSideMeals() {
		DailyMealTest.sideMeals.add("Baklava");
		DailyMealTest.sideMeals.add("Dondurma");
		DailyMealTest.sideMeals.add("Lokum");
		DailyMealTest.sideMeals.add("Kadayif");
		DailyMealTest.sideMeals.add("Ezogelin Soup");
		DailyMealTest.sideMeals.add("Mericimek Soup");
		DailyMealTest.sideMeals.add("Dolma");
		DailyMealTest.sideMeals.add("Kunefe");
		DailyMealTest.sideMeals.add("Salad");
		DailyMealTest.sideMeals.add("Pilav");

	}

	private void addMainMeals() {
		DailyMealTest.mainMeals.add("Bonfile");
		DailyMealTest.mainMeals.add("Fish");
		DailyMealTest.mainMeals.add("Chicken Durum");
		DailyMealTest.mainMeals.add("Inegol kofte");
		DailyMealTest.mainMeals.add("Iskender");
		DailyMealTest.mainMeals.add("Cag Kebab");
		DailyMealTest.mainMeals.add("Manti");
		DailyMealTest.mainMeals.add("Testi Kebab");
		DailyMealTest.mainMeals.add("Pide");
		DailyMealTest.mainMeals.add("Su Boregi");

	}

	private void addDays() {
		DailyMealTest.days.add("Monday");
		DailyMealTest.days.add("Tuesday");
		DailyMealTest.days.add("Wednesday");
		DailyMealTest.days.add("Thursday");
		DailyMealTest.days.add("Friday");
	}

}
