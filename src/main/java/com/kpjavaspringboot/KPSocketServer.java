package com.kpjavaspringboot;

//A Java program for a Server : KPSocketServer
import java.net.*; 
import java.io.*; 

public class KPSocketServer 
{ 
	//initialize socket and input stream 
	private Socket		 socket = null; 
	private ServerSocket server = null; 
	private DataInputStream in	 = null; 
	
	public static void main(String args[]) 
	{ 
		// KP : Debug Print
		System.out.println("KP : KPSocketServer -  com.kpjavaspringboot : main()");
		
		KPSocketServer server = new KPSocketServer(5000); 
	} 

	// constructor with port 
	public KPSocketServer(int port) 
	{ 
		// starts server and waits for a connection 
		try
		{ 
			server = new ServerSocket(port); 
			System.out.println("KPSocketServer started - Socket"); 

			System.out.println("Waiting for a client on Socket Connection..."); 

			socket = server.accept(); 
			System.out.println("Socket Connection Client accepted"); 
			System.out.println( "Socket Connection :" +
								" Socket Address : " + server.getLocalSocketAddress() +
								" Channel : " + server.getChannel() +
							    " Port : " + server.getLocalPort()  ); 

			// takes input from the client socket 
			in = new DataInputStream( 
				new BufferedInputStream(socket.getInputStream())); 

			String line = ""; 

			// reads message from client until "Over" is sent 
			while (!line.equals("Over")) 
			{ 
				try
				{ 
					line = in.readUTF(); 
					System.out.println(line); 

				} 
				catch(IOException i) 
				{ 
					System.out.println(i); 
				} 
			} 
			System.out.println("Closing connection"); 

			// close connection 
			socket.close(); 
			in.close(); 
		} 
		catch(IOException i) 
		{ 
			System.out.println(i); 
		} 
	} 


} 
