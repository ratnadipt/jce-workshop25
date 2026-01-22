package main;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class FileServer {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2001);
			System.out.println("File Server is Started... waiting for client!");
			
			Socket socket = server.accept();
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			
			// read file name
			String fileName = dis.readUTF();
			System.out.println("Receiving File : " + fileName);
			
			// read file data
			FileOutputStream fout = new FileOutputStream("server_"+fileName);
			
			byte[] buffer = new byte[4096];
			int byteRead;
			while((byteRead = dis.read(buffer)) != -1) {
				fout.write(buffer, 0, byteRead);
			}
			
			System.out.println("File Received successfully!");
			
			fout.close();
			socket.close();
			server.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
