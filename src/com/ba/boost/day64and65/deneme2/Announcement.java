package com.ba.boost.day64and65.deneme2;

public class Announcement extends Publication {

	private int daysToExpire;

	public Announcement(String title, int daysToExpire) {
		super(title);
		this.daysToExpire = daysToExpire;
	}

	@Override
	public String getType() {
		return "Announcement (days to expire -" + " " + this.daysToExpire + ")";
	}

}
