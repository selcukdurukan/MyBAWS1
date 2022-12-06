package com.ba.boost.day24.iostream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java\\newFile.txt");
			
			BufferedInputStream input = new BufferedInputStream(file);  //Bir de BufferOuputStream var yazmak için.
			
			int i = input.read();
			while (i != -1) {
				System.out.print((char)i);
				i = input.read();
			}
			input.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
