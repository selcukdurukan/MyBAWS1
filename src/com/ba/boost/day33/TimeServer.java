package com.ba.boost.day33;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeServer {

	public static void main(String[] args) {
		
		/*
		 * Eğer tread kullanmazsak bu server yapısı tek bir client'a hizmet sunabilir.
		 * Sadece 1 clientla iletişim kurmamızı sağlıyor
		 */
		
		System.err.println("Sunucu calisti.... ");
		
		int port = 4711;
		
		try (ServerSocket serverSocket = new ServerSocket(port)){  //Sunucunun gelen istekleri beklediği kapıyı tanımlıyoruz.
			Socket socketToClient = serverSocket.accept();
			System.out.println(socketToClient + " port'u uzerinden istemci ile iletisim kuruldu.");
			
			OutputStream os = socketToClient.getOutputStream();
			PrintWriter sender = new PrintWriter(os, true);
			while (true) {
				sender.println(LocalDateTime.now());  //ln olmazsa buffer flush'dan dolayı çalışmaz, flush dolana kadar.
				Thread.sleep(3000);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.err.println("Sunucu durdu!!! ");
		

		

	}

}
