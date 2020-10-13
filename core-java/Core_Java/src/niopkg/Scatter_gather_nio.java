package niopkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/*
	Gathering Write means Write the Data in Multiple Buffer in to One Channel
*/

/*
	Scattering read means read the Data in to Single Channel in to Multiple buffer
*/

public class Scatter_gather_nio {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {

			// For Write the Data
			FileChannel outChannel = new FileOutputStream("G:/1.txt").getChannel();
			boolean writeStatus = gathering(outChannel);
			System.out.println("Write Status : " + writeStatus);

			// For read the Data
			FileChannel inChannel = new FileInputStream("G:/1.txt").getChannel();
			boolean readStatus = scattering(inChannel);
			System.out.println("Read Status : " + readStatus);

		} catch (Exception e) {
			System.out.println("Somthing Went wronge");
		}
	}

	public static boolean gathering(FileChannel outChannel) {
		try {

			ByteBuffer randomBuffer = ByteBuffer.allocate(70);
			ByteBuffer stringBuffer = ByteBuffer.allocate(300);
			ByteBuffer doubleBuffer = ByteBuffer.allocate(222);

			// Put data in Both Buffer
			randomBuffer.asIntBuffer().put(1);
			stringBuffer.asCharBuffer().put("Write Data using Gathering");
			doubleBuffer.asDoubleBuffer().put(1.1);

			// Use Gathering
			GatheringByteChannel gatheringByteChannel = outChannel;

			// Write Multiple Buffer Data in to Single Channel
			ByteBuffer[] byteBuffers = { randomBuffer, stringBuffer, doubleBuffer };
			gatheringByteChannel.write(byteBuffers);

			outChannel.close();
			return true;

		} catch (Exception e) {

		}
		return false;

	}

	public static boolean scattering(FileChannel inChannel) {
		try {

			// read From Multiple Buffer using one read Function
			ByteBuffer randomReadBuffer = ByteBuffer.allocate(70);
			ByteBuffer stringReadBuffer = ByteBuffer.allocate(300);
			ByteBuffer doubleReadBuffer = ByteBuffer.allocate(222);

			// use Scatter
			ScatteringByteChannel scatteringByteChannel = inChannel;

			ByteBuffer[] byteReadBuffers = { randomReadBuffer, stringReadBuffer, doubleReadBuffer };

			scatteringByteChannel.read(byteReadBuffers);

			// Rewind All buffer
			randomReadBuffer.rewind();
			stringReadBuffer.rewind();
			doubleReadBuffer.rewind();

			int intData = randomReadBuffer.asIntBuffer().get();
			String stringData = stringReadBuffer.asCharBuffer().toString();
			Double doubleData = doubleReadBuffer.asDoubleBuffer().get();

			System.out.println(intData + " - " + stringData + " - " + doubleData);

			inChannel.close();

			return true;
		} catch (Exception e) {

		}
		return false;
	}

}
