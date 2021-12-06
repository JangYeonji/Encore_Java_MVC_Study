package test.model.vo;

public class TestVO {
	private String name;
	private int age;
	private String address;
	
	//Default Constructor(생성자)
	public TestVO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String info() {
		return name + "\t" + age + "\t" + address;
	}
}
