package com.ba.boost.day24.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadAFile {

	public static void main(String[] args) {
		
		char[] array = new char[50];
		
		
		try {
			FileReader input = new FileReader("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java\\newFile.txt");
			try {
				input.read(array);
				System.out.println("Data in the file: ");
				System.out.println(array);
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
