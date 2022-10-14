package com.ba.boost.atclass.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {
		
		try {
			Class clazz = Class.forName("com.ba.boost.atclass.reflection" + ".ReflectedClass");
			System.out.println(clazz);
			
			if (clazz.isEnum()) {
				System.out.println(clazz.getSimpleName() + " Bir ENUM sinifidir.");
			} else if (clazz.isLocalClass()) {
				System.out.println(clazz.getSimpleName() + " Bir yerel sinifidir.");
			} 
			
			 listFields(clazz);
			 listMethods(clazz);
			 listConstructors(clazz);
			 
			 Class cl = createObject(clazz);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		

	}

	private static Class createObject(Class clazz) throws NoSuchMethodException, SecurityException {
		Class<?>[] constType = {String.class, String.class, int.class, boolean.class}; 
		Constructor<?> contructor = clazz.getConstructor(constType);
		Object[] newInstance = {"Ali", "Veli", 4950, false};
		System.out.println(newInstance);
		return null;
	}

	private static void listConstructors(Class clazz) {
		Constructor[] methods = clazz.getConstructors();
		for (Constructor method : methods) {
			System.out.println(method);
		}
		
	}

	private static void listMethods(Class clazz) {
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		
	}

	private static void listFields(Class clazz) {
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field);
			}
			System.out.println("2. Field bilgileri: " + fields[1].getType() + " " + fields[1].getName() + " " + fields[1].getModifiers());
	}

}
