import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serial {

	public static void main(String[] args) {

		try {
			String fileName="C:\\Users\\Kajal\\Desktop\\TxtFile.txt";
			serilization seri = new serilization("kajal", "kajal@gmail.com", "Gurugram", 25);
			FileOutputStream fos = new FileOutputStream(fileName);

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			// how to serialize
			oos.writeObject(seri);

			oos.close();
			fos.close();
			System.out.println("object state is transfer to file obj : ");
			// System.out.println("Name " + getName);

		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
