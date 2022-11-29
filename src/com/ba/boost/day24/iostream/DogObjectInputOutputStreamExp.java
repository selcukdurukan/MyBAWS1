package com.ba.boost.day24.iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DogObjectInputOutputStreamExp {

	public static void main(String[] args) {
		
//		Dog dog = new Dog("Coco", "Shih-Tzu");
//		
//		DogObjectInputOutputStreamExp.serializeDog(dog);
		
		
		//Deserialize
		try {
			FileInputStream fileStream = new FileInputStream("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java\\dogFile.txt");
			ObjectInputStream input = new ObjectInputStream(fileStream);
			Dog newDog = (Dog) input.readObject();
			System.out.println(newDog);
			input.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void serializeDog(Dog dog) {
		try (ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java\\dogFile.txt"))) {
			oos.writeObject(dog);
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
