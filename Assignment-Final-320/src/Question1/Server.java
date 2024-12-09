package Question1;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static int port = 9000;
	
	public static float calculateBMI(float weight, float height) {
		return weight / (height * height);
	}
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(port);
			System.out.println("Server is running and handling clients.");
			try {
				Socket client = server.accept();
				DataInputStream inputStream = new DataInputStream(client.getInputStream());
				DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
				float bmi = calculateBMI(inputStream.readFloat(), inputStream.readFloat());
				outputStream.writeUTF(String.valueOf(bmi));
				client.close();
			} catch (Exception e) {
				System.out.println("Failed to accept client...");
				e.printStackTrace();
			}
			server.close();
		} catch (Exception e) {
			System.out.println("Server failed to launch...");
			e.printStackTrace();
		}
	}
}
