package com.ba.boost.day31.clientserver2way;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s = new Socket("localhost", 3333);

		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = "";
		String str2 = "";

		while (!str.equalsIgnoreCase("Exit")) {
			str = br.readLine();
			if (!str.equalsIgnoreCase("Exit")) {
				dout.writeUTF(str);
				dout.flush();
				str2 = din.readUTF();
				System.out.println("Server says :" + str2);

			}
		}
		s.close();
		din.close();
		br.close();
		dout.close();
	}

}
