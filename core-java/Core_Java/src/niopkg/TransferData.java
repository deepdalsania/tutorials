package niopkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Scanner;

// Transfer data from 1 file to other file using Java-NIO
public class TransferData {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Select The opetion That Listed below : ");
			System.out.println("1 : TransferTo");
			System.out.println("2 : TransferFrom");

			switch (scanner.next()) {

			case "1":

				// Destination File
				FileOutputStream outputStream = new FileOutputStream(new File("G:/1.txt"));
				WritableByteChannel destinationChannel = outputStream.getChannel();

				// Write Data in Source File
				FileOutputStream sourceFileStream = new FileOutputStream("G:/12.txt");
				sourceFileStream.write("Data Write in Source File".getBytes());
				sourceFileStream.close();

				// Source File open with read mode
				FileInputStream inputStream = new FileInputStream(new File("G:/12.txt"));

				FileChannel sourceChannel = inputStream.getChannel();
				sourceChannel.transferTo(0, sourceChannel.size(), destinationChannel);

				sourceChannel.close();
				inputStream.close();

				System.out.println("Successfully Transfer The Data from '1.txt' to '12.txt'");
				break;

			case "2":

				FileOutputStream outputStream2 = new FileOutputStream(new File("G:/22.txt"));
				outputStream2.write("Write Data in source file".getBytes());
				outputStream2.close();

				// by Using Random Access File with JAVA-NIO
				RandomAccessFile sourceFile = new RandomAccessFile("G:/22.txt", "r");
				FileChannel sourceChannelFrom = sourceFile.getChannel();

				RandomAccessFile destFile = new RandomAccessFile("G:/33.txt", "rw");
				FileChannel destinationChannelFrom = destFile.getChannel();

				destinationChannelFrom.transferFrom(sourceChannelFrom, 0, sourceChannelFrom.size());
				System.out.println("Successfully Transfer The Data from '22.txt' to '33.txt'");

				break;

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
