package extraknowledge;

import java.io.File;
import java.io.IOException;  
import java.io.RandomAccessFile;  
  
public class RandomAccessFileExample {  
     
    public static void main(String[] args) {  
        try {
        	File f = new File("D:/DEEP/test1.txt");
        	f.createNewFile();
            System.out.println(new String(readFromFile(f, 0, 18)));  
            writeToFile(f, "I love my country and my people", 31);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    private static byte[] readFromFile(File f, int position, int size)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(f, "r");  
        file.seek(position);  
        byte[] bytes = new byte[size];  
        file.read(bytes);  
        file.close();  
        return bytes;  
    }  
    private static void writeToFile(File f, String data, int position)  
            throws IOException {  
        RandomAccessFile file = new RandomAccessFile(f, "rw");  
        file.seek(position);  
        file.write(data.getBytes());  
        file.close();  
    }  
}  
