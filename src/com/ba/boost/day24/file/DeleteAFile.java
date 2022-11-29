package com.ba.boost.day24.file;

import java.io.File;

public class DeleteAFile {

	public static void main(String[] args) {
		
		
		File file = new File("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java", "newFile.txt");
		
		boolean value = file.delete();
		
		if (value) {
			System.out.println("File was deleted");
		} else {
			System.out.println("File was not deleted");
		}

	}

}
