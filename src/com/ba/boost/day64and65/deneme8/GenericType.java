package com.ba.boost.day64and65.deneme8;

public class GenericType<T> {
	
	private T type;
	
	public GenericType(T type) {
		super();
		this.type = type;
	}


	public T getType() {
		return type;
	}

	public void setType(T type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "GenericType [type=" + type + "]";
	}
	
	
	
	
	
	
	
}
