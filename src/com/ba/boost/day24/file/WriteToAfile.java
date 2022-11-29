package com.ba.boost.day24.file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAfile {

	public static void main(String[] args) throws IOException {
		
		String data =  "Bu metin output.txt dosyasina yazilacak.111";
		FileWriter output = null;
		try {
			output =  new FileWriter("C:\\Users\\selcu\\Desktop\\Deneme Dosyaları Java\\newFile.txt");
			output.write(data);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			output.close();
		}

	}

}
