package main;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
public class ClientHandler extends Thread {
	private Socket socket;
	
	public ClientHandler(Socket socket) {
		this.socket = socket;
	}
	
	// thread code 
	@Override
	public void run() {
		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
			// receive request
			String message = dis.readUTF();
			System.out.println("Client Says : " + message);
			
			// send response
			dos.writeUTF("Server received : " + message);
			
			dos.flush();
			
			socket.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
