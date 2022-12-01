package com.ba.boost.day33.threadandclientserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.Buffer;

public class TimeClient {

	public static void main(String[] args) {
		
		System.err.println("Istemci calisti... ");
		
		int port = 4711;
		String hostName = "localhost"; //127.0.0.1
		
		try (Socket socketToServer = new Socket(hostName, port)){
			
			System.out.println(socketToServer + " port'u uzerinden istemci ile iletisim kuruldu.");
			
			InputStream is = socketToServer.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			while (true) {
				String line = reader.readLine();
				System.out.println(line);			
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.err.println("Istemci durdu!!! ");

	}

}
