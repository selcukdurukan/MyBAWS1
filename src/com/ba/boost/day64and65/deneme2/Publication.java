package com.ba.boost.day64and65.deneme2;

public class Publication {
	
    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + ": " + getDetails();
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return this.title;
    }

}
