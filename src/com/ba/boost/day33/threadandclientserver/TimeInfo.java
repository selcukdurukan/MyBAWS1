package com.ba.boost.day33.threadandclientserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;

public class TimeInfo implements Runnable {

	private Socket socketToClient;
	private int clientId;

	public TimeInfo(Socket socketToClient, int clientId) {
		super();
		this.socketToClient = socketToClient;
		this.clientId = clientId;
	}

	@Override
	public void run() {
		System.out.println(socketToClient + " port'u uzerinden istemci - " + this.clientId + " ile iletisim kuruldu.");
		System.out.println("Istemci - " + this.clientId + "'nin calistigi thread: " + Thread.currentThread().getName()
				+ "'in " + Thread.currentThread().getThreadGroup());

		try (PrintWriter sender = new PrintWriter(socketToClient.getOutputStream(), true)) {
			while (true) {
				sender.println(LocalDateTime.now()); // ln olmazsa buffer flush'dan dolayı çalışmaz, flush dolana kadar.
				Thread.sleep(3000);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
