package com.ba.boost.day64and65.deneme7;
	
	public class Cat {

	    private String name;
	    private String color;
	    private int size;

	    public Cat(String name, String color, int size) {
	        this.name = name;
	        this.color = color;
	        this.size = size;
	    }

	    public class Bow {
	        String color;
	        int size;

	        public Bow(String color, int size) {
	            this.color = color;
	            this.size = size;
	        }

	        public void printColor() {
	            System.out.print("Cat " + name + " is " + color + ". ");
	            System.out.print("The size of " + name + " is " + size + ". ");
	            System.out.print("Cat " + name + " has " + this.color + " bow. ");
	            System.out.print("The size of bow is " + this.size + ".");
	        }
	    }

	}


