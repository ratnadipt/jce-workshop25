package main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class FileClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 2001);
			System.out.println("Connected to Server!");
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			File file = new File("abc.txt");
			
			// send to server
			dos.writeUTF(file.getName());
			
			FileInputStream fin = new FileInputStream(file);
			
			byte[] buffer = new byte[4096];
			int byteRead;
			while((byteRead = fin.read(buffer)) != -1) {
				dos.write(buffer, 0, byteRead);
			}
			
			System.out.println("File send successfully!");
			
			fin.close();
			dos.close();
			socket.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
