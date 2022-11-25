package com.ba.boost.day23.HWexceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {

	private ArrayList<Person> persons = new ArrayList<>();
	private File serializedFile = new File("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java", "exception.txt");

	public static void main(String[] args) {

		PersonTest obj = new PersonTest();

//		obj.createData();
//		Collections.sort(obj.persons, new PersonByName());
//		for (int i = 0; i < obj.persons.size(); i++) {
//			System.out.println(obj.persons.get(i));
//			try {
//				obj.persons.get(i).manCheck("She can come.");
//			} catch (ManException e) {
//				System.err.println(e.getMessage());
//			} finally {
//				System.out.println();
//			}
//			
//		}
//
//		obj.serializePersons();
		obj.deserializePersons();

		System.out.println();
		System.out.println(obj.persons);

	}

	private void createData() {
		persons.add(new Person("Ali", "M"));
		persons.add(new Person("Funda", "F"));
		persons.add(new Person("Kemal", "M"));
		persons.add(new Person("Asli", "F"));
		persons.add(new Person("Muhammed", "M"));
	}

	private void deserializePersons() {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.serializedFile))) {
			this.persons = (ArrayList) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void serializePersons() {
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(this.serializedFile))) {
			oos.writeObject(this.persons);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
