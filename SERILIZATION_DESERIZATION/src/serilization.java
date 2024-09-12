import java.io.Serializable;

public class serilization  implements Serializable{
	private String name;
    private transient String email;
	private String address;
	private int age;
	

	public serilization(String name, String email, String address, int age) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}

	public serilization() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void displayInformation() {
		System.out.println("Hii my is " + this.name);
	}

}
