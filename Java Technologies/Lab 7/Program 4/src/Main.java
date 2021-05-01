import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void splitFile(File f) {
		int counter = 1;
		int fileSize = 5000;
		String fileName = f.getName();
		byte buffer[] = new byte[fileSize];
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int byteAmount = 0;
			while((byteAmount = bis.read(buffer)) > 0) {
				String filePartName = "D:\\Workspace\\DDU SEM 4 PROGRAMS\\Java Technologies\\Lab 7\\Program 4\\Destination\\"+"part"+(counter++)+".txt";
				File newFile = new File(filePartName);
				FileOutputStream fos = new FileOutputStream(newFile);
				fos.write(buffer, 0, byteAmount);
			}
			System.out.println("File splitted into "+(counter - 1)+ " parts");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		String path = "D:\\Workspace\\DDU SEM 4 PROGRAMS\\Java Technologies\\Lab 7\\Program 4\\Source\\file.txt";
		splitFile(new File(path));
	}

}
