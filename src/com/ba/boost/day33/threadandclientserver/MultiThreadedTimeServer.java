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
		 * Bu serverda farklı threadler kullandıgımız için bu threadlerle birlikte
		 * sunucuya tekrar client bağlayabiliriz. (TimeClient'ı 2 kere çalıştır.)
		 */

		System.err.println("Sunucu calisti.... ");
		
		int port = 4711;
		
		//Server 4711 portunu dinliyorSunucunun gelen istekleri beklediği kapıyı tanımlıyoruz.
		try (ServerSocket serverSocket = new ServerSocket(port)) { 
			
			int clientCounter = 1;
			
			//Sunucu gelen istekleri her zaman kabul edecek durumda olmalı bu yüzden istekleri sonsuz döngü içinde bekleyecegiz.
			while (true) {
				
				//Gelen client isteklerini almak için var.
				Socket socketToClient = serverSocket.accept();
				
				TimeInfo timeInfo = new TimeInfo(socketToClient, clientCounter++);
				Thread timeInfoServerThread = new Thread(timeInfo, "Client - " + (clientCounter-1));
				timeInfoServerThread.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.err.println("Sunucu durdu!!! ");

	}

}
