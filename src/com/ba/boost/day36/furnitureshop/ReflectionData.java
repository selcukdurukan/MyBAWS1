package com.ba.boost.day36.furnitureshop;

public class ReflectionData {

	private String name;
	private Class<?> clazz;

	public ReflectionData(String name, Class<?> clazz) {
		super();
		this.name = name;
		this.clazz = clazz;
	}

	public String getName() {
		return name;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	@Override
	public String toString() {
		return "ReflectionData [name=" + name + ", clazz=" + clazz + "]";
	}

}
