package main;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
public class ServerApp {
	public static void main(String[] args) {
		// 1. Create ServerSocket on Port 2000
		try {
			ServerSocket server = new ServerSocket(2000);
			System.out.println("Server is started. waiting for client....");
			
			// 2. Accept Client Connection
			
			Socket socket = server.accept();
			
			// 3. Create Data Streams
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dop = new DataOutputStream(socket.getOutputStream());
			
			// 4. Read client request
			String clientMsg = din.readUTF();
			System.out.println("Client Says : " + clientMsg);
			
			// 5. send response to client from server
			dop.writeUTF("Hi, Client!, Message received!");
			
			dop.flush();
			
			// 6. close resources
			socket.close();
			server.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}	
}
