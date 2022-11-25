package com.ba.boost.day23.iowithjava;

import java.io.File;
import java.io.IOException;

public class FileExp {

	private static final String MAIN_WORKİNG_AREA = "C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java";

	public static void main(String[] args) {
		
		File file = new File(MAIN_WORKİNG_AREA);
		
		if (file.exists()) {
			System.out.println("Boyle bir dosya var.");
		}
		
		if (file.isDirectory()) {
			System.out.println("... ve bu bir klasor.");
		}
		
		if (file.isFile()) {
			System.out.println(".... ve bu bir dosya.");
		}
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getParent());
		System.out.println(file.getPath());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		try {
			File newFile = new File(MAIN_WORKİNG_AREA + "\\My First File.txt");  //First using type..
			
			if (newFile.createNewFile()) {
				System.out.println("Istenilen dosya olusturuldu.");
			} else {
				System.out.println("Istenilen dosya olusturulamadi.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			File newFile1 = new File(MAIN_WORKİNG_AREA, "My Second File.txt");  //Second using type..
			
			if (newFile1.createNewFile()) {
				System.out.println("Istenilen dosya olusturuldu.");
			} else {
				System.out.println("Istenilen dosya olusturulamadi.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			File newFile1 = new File(file, "My third File.txt");  //Third using type..
			
			if (newFile1.createNewFile()) {
				System.out.println("Istenilen dosya olusturuldu.");
			} else {
				System.out.println("Istenilen dosya olusturulamadi.");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] files = file.list();    
		for (String i : files) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
