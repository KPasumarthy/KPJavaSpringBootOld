package com.kpjavaspringboot.socket;

//A Java program for a Client : KPSocketClient
import java.net.*;
import java.io.*;

public class KPSocketClient {
	// initialize socket and input output streams
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream out = null;

	public static void main(String args[]) {
		KPSocketClient client = new KPSocketClient("127.0.0.1", 5000);

		// KP : Debug Print
		System.out.println("KP : KPSocketClient -  com.kpjavaspringboot : main()");
	}

	// constructor to put ip address and port
	@SuppressWarnings("deprecation")
	public KPSocketClient(String address, int port) {
		// establish a connection
		try {
			socket = new Socket(address, port);
			System.out.println("KP : KPSocketClient Connected");

			// takes input from terminal
			input = new DataInputStream(System.in);

			// sends output to the socket
			out = new DataOutputStream(socket.getOutputStream());
		} catch (UnknownHostException u) {
			System.out.println(u);
		} catch (IOException i) {
			System.out.println(i);
		}

		// string to read message from input
		String line = "";

		// keep reading until "Over" is input
		while (!line.equals("Over")) {
			try {
				line = input.readLine();
				out.writeUTF(line);
			} catch (IOException i) {
				System.out.println(i);
			}
		}

		// close the connection
		try {
			input.close();
			out.close();
			socket.close();
		} catch (IOException i) {
			System.out.println(i);
		}
	}

}