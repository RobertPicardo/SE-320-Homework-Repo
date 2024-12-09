package Question2;
import java.io.*;
import java.net.Socket;

public class Client {
	public static int port = 9000;
	public static float weightKg = 57.4f;
	public static float heightM = 1.6f;
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", port);
			socket.setSoTimeout(5000);
			DataInputStream inputStream = new DataInputStream(socket.getInputStream());
			DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
			outputStream.writeFloat(weightKg);
			outputStream.writeFloat(heightM);
			String bmiData = inputStream.readUTF();
			socket.close();
			System.out.println(bmiData);
		} catch (Exception e) {
			System.out.println("Client failed...");
			System.out.println(e.toString());
		}
	}
}
