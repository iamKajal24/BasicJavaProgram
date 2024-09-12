import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilization {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\Kajal\\Desktop\\TxtFile.txt";
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);

			serilization seri = (serilization) ois.readObject();
			seri.displayInformation();
			System.out.println(seri.getName());
			System.out.println(seri.getEmail());
			System.out.println(seri.getAddress());
			System.out.println(seri.getAge());
		
			
			ois.close();
			fis.close();
		} 
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
}
