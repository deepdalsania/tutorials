package niopkg;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// read and Write From the File By Using Java NIO package
public class Path_nio {

	public static void main(String[] args) {
		try {

			// Specify the File
			Path filePath = Paths.get("G:/1.txt");

			// For Write The data
			OutputStream outputStream = Files.newOutputStream(filePath);

			// Write String as Bytes
			outputStream.write("Write Data Using JAVA_NIO".getBytes());

			outputStream.close();

			// For read the Data
			InputStream inputStream = Files.newInputStream(filePath);

			// read Status
			int readStatus = 1;

			// One by One Character Read from the File
			while ((readStatus = inputStream.read()) != -1) {

				System.out.print((char) readStatus);
			}

		} catch (Exception e) {

		}

	}

}

kkothari_3
