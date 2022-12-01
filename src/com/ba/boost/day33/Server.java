package com.ba.boost.day33;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		System.out.println("Sunucu calisti.... ");
		
		int port = 4711;
		
		try (ServerSocket serverSocket = new ServerSocket(port)){  //Sunucunun gelen istekleri beklediği kapıyı tanımlıyoruz.
			Socket socketToClient = serverSocket.accept();
			System.out.println(socketToClient + " port'u uzerinden istemci ile iletisim kuruldu.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("Sunucu durdu!!! ");
		

		

	}

}
