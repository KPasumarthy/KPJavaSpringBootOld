package com.kpjavaspringboot.socket;

//A Java program for a Client : KPSocketClient
import java.net.*;
import java.util.Scanner;
import java.io.*;

public class KPSocketThreadClient {
	// initialize socket and input output streams
	private Socket socket = null;
	private DataInputStream input = null;
	private DataOutputStream out = null;

	public static void main(String args[]) {
		KPSocketThreadClient client = new KPSocketThreadClient("127.0.0.1", 5000);

		// KP : Debug Print
		System.out.println("KP : KPSocketThreadClient -  com.kpjavaspringboot : main()");
	}

	// constructor to put ip address and port
	@SuppressWarnings("deprecation")
	public KPSocketThreadClient(String address, int port) {
		try
        { 
            Scanner scn = new Scanner(System.in); 
              
            // getting localhost ip 
            InetAddress ip = InetAddress.getByName("localhost"); 
      
            // establish the connection with server port 5056 
            Socket s = new Socket(ip, 5056); 
        	System.out.println("KP : KPSocketThreadClient Connected");
      
            // obtaining input and out streams 
            DataInputStream dis = new DataInputStream(s.getInputStream()); 
            DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
      
            // the following loop performs the exchange of 
            // information between client and client handler 
            while (true)  
            { 
                System.out.println(dis.readUTF()); 
                String tosend = scn.nextLine(); 
                dos.writeUTF(tosend); 
                  
                // If client sends exit,close this connection  
                // and then break from the while loop 
                if(tosend.equals("Exit")) 
                { 
                    System.out.println("Closing this connection : " + s); 
                    s.close(); 
                    System.out.println("Connection closed"); 
                    break; 
                } 
                  
                // printing date or time as requested by client 
                String received = dis.readUTF(); 
                System.out.println(received); 
            } 
              
            // closing resources 
            scn.close(); 
            dis.close(); 
            dos.close(); 
        }catch(Exception e){ 
            e.printStackTrace(); 
        } 
	}

}