package com.ba.boost.day23.iowithjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataOutputExample {

	public static void main(String[] args) {
		
		List<Double> datas = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(CommonData.MAIN_WORKİNG_AREA, "data.txt")))){
			
			while (true) {
				String line = reader.readLine();
				if (line == null) break;
				
				try {
					double value = Double.parseDouble(line);
					datas.add(value);
				} catch (NumberFormatException e) {
					System.out.println("<<< " + line + " >>> dogru sekilde okunamadi. Bir sonraki veri ile devam ediyorum." );
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		try (DataOutputStream out =  new DataOutputStream(  //Byte'ları obje olarak yazmak için data yöntemlerini kullamayı sağlıyoruz.
						new BufferedOutputStream(  			//performant bir şekilde yazmak için buffet kullanıyoruz.
								new FileOutputStream(  		//byte olarak yazmak için stream açıyoruz
										new File(CommonData.MAIN_WORKİNG_AREA , "data.dat"))))){  //Dosya objesi
			
			for (Double i : datas) {
				out.writeDouble(i);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (DataInputStream in =  new DataInputStream(		//Byte'ları obje olarak OKUMAK için data yöntemlerini kullamayı sağlıyoruz.
						new BufferedInputStream(			//performant bir şekilde OKUMAK için buffet kullanıyoruz.	
								new FileInputStream			//byte olarak OKUMAK için stream açıyoruz
								(new File(CommonData.MAIN_WORKİNG_AREA , "data.dat"))))){ //Dosya objesi
			
			System.out.println();
			while (in.available() > 0) {   //Okunabilecek veri boyutu 0 olunca döngüden çıkıyor.
				double value = in.readDouble();
				System.out.println(value);
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
//		for (Double i : datas) {
//			System.out.println(i);
//		}

	}

}
