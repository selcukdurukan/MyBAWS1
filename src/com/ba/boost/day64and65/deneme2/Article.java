package com.ba.boost.day64and65.deneme2;

public class Article extends Publication {
	
    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }


    @Override
    public String getType() {
        return "Article (author -" + " " + this.author + ")" ;
    }

}
