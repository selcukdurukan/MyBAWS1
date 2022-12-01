package com.ba.boost.day31.clientserver2way;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(3333);
		Socket s = ss.accept();

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		String str2 = "";

		while (!str.equalsIgnoreCase("Exit")) {

			str = din.readUTF();
			if (!str.equalsIgnoreCase("Exit")) {
				System.out.println("Client say: " + str);
				str2 = br.readLine();
				dout.writeUTF(str2);
				dout.flush();

			}
		}
		ss.close();
		s.close();
		din.close();
		dout.close();
		br.close();

	}

}
