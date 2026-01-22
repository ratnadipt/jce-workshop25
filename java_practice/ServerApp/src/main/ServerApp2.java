package main;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
public class ServerApp2 {
	public static void main(String[] args) {
		// 1. Create ServerSocket on Port 2000
		try {
			ServerSocket server = new ServerSocket(2000);
			System.out.println("Server is started. waiting for client....");
			
			while(true) {
				
				Socket socket = server.accept();
				System.out.println("Client is connected !");
				
				ClientHandler handler = new ClientHandler(socket);
				handler.start(); // thread start
				
			}
	
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}	
}
