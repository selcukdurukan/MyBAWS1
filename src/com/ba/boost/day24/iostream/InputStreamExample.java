package com.ba.boost.day24.iostream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {

		try {
			InputStream input = new FileInputStream("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java\\newFile.txt");
			System.out.println("Available bytes in the file: " + input.available());

			byte[] array = new byte[input.available()];
			
			input.skip(5);  // 5 char atlar.
			

			input.read(array);
			String data = new String(array);
			System.out.println(data);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
