package Collection12022024;

import java.util.ArrayList;

class book {
	int id;
	String name, author, publisher;
	int quantity;

	public book(int id, String name, String author, String Publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class JavaArrayListBookExample {

	public static void main(String[] args) {
		ArrayList<book> list = new ArrayList<book>();
		book b1 = new book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		book b2 = new book(102, "Data Communications and Networking", "Forouzan", "Mc Graw Hill", 4);
		book b3 = new book(103, "Operating System", "Galvin", "Wiley", 6);

		list.add(b1);
		list.add(b2);
		list.add(b3);

		for (book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}
}
