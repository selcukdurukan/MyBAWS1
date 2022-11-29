package com.ba.boost.day24.iostream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void main(String[] args) {
		
		String data= "Bu metni yaz.";
		
		try {
			OutputStream output =  new FileOutputStream("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java\\newFile.txt");
			byte[] dataBytes = data.getBytes();
			output.write(dataBytes);
			
			output.flush();  //buffer'ın içini boşaltır
			output.close();  //her zaman yazdıktan sonra kapat.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
