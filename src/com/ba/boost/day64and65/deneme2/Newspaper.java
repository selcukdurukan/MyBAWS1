package com.ba.boost.day64and65.deneme2;

public class Newspaper extends Publication {
	
    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    @Override
    public String getType() {
        return "Newspaper (source -" + " " + this.source + ")" ;
    }

}
