package Collection12022024;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.ArrayList;

public class ArrayListSerializationAndDeserialization {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Mahesh");

		try {
			// serialization

			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream OOS = new ObjectOutputStream(fos);
			OOS.writeObject(list);
			fos.close();
			OOS.close();

			// Deserialization

			FileInputStream Fis = new FileInputStream("file");
			ObjectInputStream OIS = new ObjectInputStream(Fis);
			ArrayList list1 = (ArrayList) OIS.readObject();
			System.out.println(list1);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
