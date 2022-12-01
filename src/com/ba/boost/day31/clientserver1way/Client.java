package com.ba.boost.day31.clientserver1way;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	private Socket socket;
	private DataInputStream input;
	private DataOutputStream output;

	public Client(String address, int port) {

		try {
			socket = new Socket(address, port);
			System.out.println("Connected");

			// Takes input from terminal
			input = new DataInputStream(System.in);

			// sends output to the socket
			output = new DataOutputStream(socket.getOutputStream());
			
			String line = "";
			while (!line.equalsIgnoreCase("Exit")) {
				line = input.readLine();
				output.writeUTF(line);
			}


		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
				output.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		Client client = new Client("127.0.0.1", 3333);
	}

}
