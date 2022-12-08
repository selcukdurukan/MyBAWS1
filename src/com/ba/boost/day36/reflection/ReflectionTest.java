package com.ba.boost.day36.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("com.ba.boost.day36.reflection" + ".ReflectedClass");
			System.out.println(clazz);

//			if (clazz.isEnum()) {
//				System.out.println(clazz.getSimpleName() + " Bir ENUM sinifidir.");
//			} else if (clazz.isLocalClass()) {
//				System.out.println(clazz.getSimpleName() + " Bir yerel sinifidir.");
//			}

			listFields(clazz);
			System.out.println();
			listMethods(clazz);
			System.out.println();
			listConstructors(clazz);

			ReflectedClass cl = createObject(clazz);
			Method theMethod = findMethod(clazz, "setBirthYear");
			theMethod.invoke(cl, 1970); // Dogum tarihini 80'den 70'e çekti
			System.out.println(cl);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

	private static Method findMethod(Class clazz, String methodName) {
		Method[] methods = clazz.getDeclaredMethods();
		Method findMethod = null;
		for (Method method : methods) {
			if (methodName.equalsIgnoreCase(method.getName())) {
				findMethod = method;
				break;
			}
		}
		
//		if (findMethod != null) {
//			if (!findMethod.isAccessible()) {
//				findMethod.setAccessible(true);
//			}
//		}

		return findMethod;
	}

	private static ReflectedClass createObject(Class clazz) throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?>[] constType = { String.class, String.class, int.class, boolean.class };
		Constructor<?> contructor = clazz.getConstructor(constType);
		Object[] params = { "Ali", "Veli", 1980, false };
		Object newInstance = contructor.newInstance(params);
		System.out.println(newInstance);
		return (ReflectedClass) newInstance;
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
		System.out.println("2. Field bilgileri: " + fields[1].getType() + " " + fields[1].getName() + " "
				+ fields[1].getModifiers());
	}

}
