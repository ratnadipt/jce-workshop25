package main;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
public class ClientApp {
	public static void main(String[] args) {
		try {
			// 1. Connect to server
			Socket clientSocket = new Socket("localhost", 2000);
			System.out.println("Connected to Server.");
			
			// 2. Create Stream
			DataInputStream din = new DataInputStream(clientSocket.getInputStream());
			DataOutputStream dop = new DataOutputStream(clientSocket.getOutputStream());
			
			// 3. Send request to server
			dop.writeUTF("Hello, Server!");
			dop.flush();
			
			// 4. Receive response from the server
			String response = din.readUTF();
			System.out.println("Server Says : " + response);
			
			// 5. close
			clientSocket.close();
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
