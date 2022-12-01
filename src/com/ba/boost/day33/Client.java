package com.ba.boost.day33;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Istemci calisti... ");
		
		int port = 4711;
		String hostName = "localhost"; //127.0.0.1
		
		try (Socket socketToServer = new Socket(hostName, port)){
			
			System.out.println(socketToServer + " port'u uzerinden istemci ile iletisim kuruldu.");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println("Istemci durdu!!! ");

	}

}
