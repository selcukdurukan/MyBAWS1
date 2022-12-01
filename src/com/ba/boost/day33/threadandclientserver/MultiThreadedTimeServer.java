package com.ba.boost.day33.threadandclientserver;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class MultiThreadedTimeServer {

	public static void main(String[] args) {
		
		/*
		 *Bu serverda farklı threadler kullandıgımız için bu threadlerle birlikte sunucuya tekrar client bağlayabiliriz.
		 *(TimeClient'ı 2 kere çalıştır.)
		 */
		
		System.err.println("Sunucu calisti.... ");
		
		int port = 4711;
		
		try (ServerSocket serverSocket = new ServerSocket(port)){  //Sunucunun gelen istekleri beklediği kapıyı tanımlıyoruz.
			
			int clientCounter = 1;
			while (true) {
				Socket socketToClient = serverSocket.accept();
				
				TimeInfo timeInfo = new TimeInfo(socketToClient, clientCounter++);
				Thread timeInfoServerThread = new Thread(timeInfo, "Client - " + (clientCounter));
				timeInfoServerThread.start();
			}
			
			

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.err.println("Sunucu durdu!!! ");
		

		

	}

}
