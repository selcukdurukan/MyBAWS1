package com.ba.boost.day23.iowithjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExp {

	public static void main(String[] args) {

		File letterFile = new File(CommonData.MAIN_WORKİNG_AREA, "mektup.txt");

		if (letterFile.exists()) {

			try {
				FileReader fileReader = new FileReader(letterFile); // harf-harf okumak için bir reader kullanırız.
																	// Bu okumayı da bir dosyadan yaptıgımız için
																	// FileReader kullanıyoruz.

				BufferedReader reader = new BufferedReader(fileReader); // Okuma işlemini performanslı ve optimal
																		// şekilde yapabilmek için.

				while (true) {
					String line = reader.readLine(); // Reader bir dosyadan satır satır okuyor.
					if (line == null) {
						break;   //Eğer dosyanın sonuna vardıysak son gelen bilgi "NULL" dir.
					}
					System.out.println(line);
				}
				reader.close();
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
