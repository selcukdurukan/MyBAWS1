package com.ba.boost.day23.iowithjava.serialization;
//Eğer elle serialize etmek istersek farklı bir interface kullanmamız gerekli: Externalizable
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.ba.boost.day23.iowithjava.CommonData;

public class SerializeDeserializeExp {

	private TreeMap<String, Person> persons = new TreeMap<>();;
	private File serializedFile = new File(CommonData.MAIN_WORKİNG_AREA, "persons.ser");

//	public SerializeDeserializeExp() {
//		super();
//		this.persons = new TreeMap<>();
//		this.serializedFile = new File(CommonData.MAIN_WORKİNG_AREA, "persons.ser");
//	}

	public static void main(String[] args) {

		SerializeDeserializeExp exp = new SerializeDeserializeExp();
		exp.createInitialData();   //İlk personları yaratır a-b-c ancak kaydetmez
		exp.serializePerson();     //İlk yaratılan personlarıpersons.ser dosyasına ekler.
		exp.listData();            //listeler
		
//		exp.deserializePerson();   //persons.ser dosyasında yazan personları tekrar javaya initialize eder.
//		exp.listData();
		
//		exp.deserializePerson();   //persons.ser dosyasında yazan personları tekrar javaya initialize eder.
//		exp.addAdditionalData();   //z yaratır ancak kaydetmez.
//		exp.serializePerson();     //Son yaratılan z kişisini persons.ser dosyasına ekler.
//		exp.listData();
		
//		exp.deserializePerson();   //persons.ser dosyasında yazan personları tekrar javaya initialize eder.
//		exp.listData();

//		exp.persons.forEach((s, t) -> System.out.println(s + " " + t));

		System.out.println("Bye....");

	}

	private void listData() {
		System.out.println("Kisi Listesi");
		System.out.println("======================");
		Set<Entry<String, Person>> entriers = this.persons.entrySet();
		for (Entry<String, Person> i : entriers) {
			System.out.println(i);
		}
		System.out.println();
	
	}

	private void addAdditionalData() {
		
		Person p = new Person("Zzzz", 1988, 1);
		p.addAddress(new Address("Turkiye", "Istanbul", 34056, "Bagdat Caddesi"));
		this.persons.put(p.getName(), p);
		
	}

	private void deserializePerson() {
		
		// try with resources - Dosyayı açtım mı kapattım mı derdi yok, eğer bunu try'ın
		// block'unda yazarkan finally blockta oos'i kapatıp tekrar try cathc kullanman
		// gerekir.
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.serializedFile))) {
			try {
				this.persons = (TreeMap<String, Person>) ois.readObject();
			} catch (ClassNotFoundException e) {
				System.err.println("Persons listesi yaratilirken hata olustu: <<<" + e.getMessage() + " >>>");
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Dosya yaratirlirken hata olustu: <<<" + e.getMessage() + " >>>");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Kisileri deserialize ederken hata olustu: <<<" + e.getMessage() + " >>>");
		}
	}

	private void serializePerson() {

		// try with resources - Dosyayı açtım mı kapattım mı derdi yok, eğer bunu try'ın
		// block'unda yazarkan finally blockta oos'i kapatıp tekrar try cathc kullanman
		// gerekir.
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream(this.serializedFile))) {

			oos.writeObject(this.persons);

		} catch (FileNotFoundException e) {
			System.err.println("Dosya yaratirlirken hata olustu: <<<" + e.getMessage() + " >>>");
//			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Kisileri serialize ederken hata olustu: <<<" + e.getMessage() + " >>>");
//			e1.printStackTrace();
		}

	}

	private void createInitialData() {
		Address a1 = new Address("Turkiye", "Ankara", 06100, "Cinnah");
		Address a2 = new Address("Turkiye", "Istanbul", 34000, "Beyoglu");
		Address a3 = new Address("Turkiye", "Izmır", 35000, "Kordon");
		Address a4 = new Address("Turkiye", "Ankara", 06100, "Cankaya");

		Person p1 = new Person("Aaaa", 2020, 2);
		p1.addAddress(a1);
		p1.addAddress(a4);
		this.persons.put(p1.getName(), p1);

		Person p2 = new Person("Bbbbb", 2020, 3);
		p2.addAddress(a1);
		p2.addAddress(a3);
		this.persons.put(p2.getName(), p2);

		Person p3 = new Person("Ccccc", 1998, 4);
		p3.addAddress(a1);
		p3.addAddress(a2);
		p3.addAddress(a3);
		p3.addAddress(a4);
		this.persons.put(p3.getName(), p3);

	}

}
