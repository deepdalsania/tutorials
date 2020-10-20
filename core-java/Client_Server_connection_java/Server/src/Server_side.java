import java.net.*;
import java.io.*;
public class Server_side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket sr = new ServerSocket(5555);
			Socket s = sr.accept();
			DataInputStream data = new DataInputStream(s.getInputStream());
			String string = data.readUTF();
			FileOutputStream writer = new FileOutputStream("E:\\database.txt");
			byte b[] = string.getBytes();
			writer.write(b);
			System.out.println("server massage = "+string);
			writer.close();
			sr.close();
		}catch(Exception e) {
			System.err.println(e);
		}
	}

}
