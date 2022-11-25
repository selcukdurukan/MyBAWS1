package com.ba.boost.day23.iowithjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExpWithOpenWithResources {

	public static void main(String[] args) {

		File letterFile = new File(CommonData.MAIN_WORKİNG_AREA, "mektup.txt");

		if (letterFile.exists()) {

			//TRY with Resources
//			try (FileReader fileReader = new FileReader(letterFile); BufferedReader reader = new BufferedReader(fileReader)) {
			try (BufferedReader reader = new BufferedReader(new FileReader(letterFile))) {

				while (true) {
					String line = reader.readLine(); // Reader bir dosyadan satır satır okuyor.
					if (line == null) {
						break;   //Eğer dosyanın sonuna vardıysak son gelen bilgi "NULL" dir.
					}
					System.out.println(line);
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else {
			System.err.println("Aradiginiz dosya yok..");
		}
		System.err.println("Bye...");

	}

}
