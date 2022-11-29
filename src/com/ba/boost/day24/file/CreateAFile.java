package com.ba.boost.day24.file;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
		
		
		File file = new File("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java", "newFile.txt");
		
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
