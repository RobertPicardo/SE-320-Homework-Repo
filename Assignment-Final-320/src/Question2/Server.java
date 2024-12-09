package Question2;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class Server {
	public static class ClientThread extends Thread {
		private Socket socket;
		
		public ClientThread(Socket socket) {
			this.socket = socket;
			try {
				this.socket.setSoTimeout(5000);
			} catch (SocketException e) {
				System.out.println("Operation error on socket...");
				System.out.println(e.toString());
				this.interrupt();
			}
		}
		
		public void run() {
			try {
				DataInputStream inputStream = new DataInputStream(socket.getInputStream());
				DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
				float bmi = calculateBMI(inputStream.readFloat(), inputStream.readFloat());
				outputStream.writeUTF(String.valueOf(bmi));
				socket.close();
			} catch (Exception e) {
				System.out.println("Terminated a client...");
				System.out.println(e.toString());
			}
			this.interrupt();
		}
	}
	
	public static int port = 9000;
	
	public static float calculateBMI(float weight, float height) {
		return weight / (height * height);
	}
	
	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(port);
			System.out.println("Server is running and handling clients.");
			while (true) {
				try {
					Socket client = server.accept();
					ClientThread thread = new ClientThread(client);
					thread.start();
				} catch (Exception e) {
					System.out.println("Failed to accept client...");
					System.out.println(e.toString());
				}
			}
		} catch (Exception e) {
			System.out.println("Server failed to launch...");
			System.out.println(e.toString());
		}
	}
}
