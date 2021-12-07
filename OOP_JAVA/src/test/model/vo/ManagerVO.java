package test.model.vo;

public class ManagerVO extends PersonVO{
	private String dept;
	
	public ManagerVO() {

	}
	public ManagerVO(String name, int age, String address, String dept) {
		super(name,age,address);
		this.dept = dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public String empInfo() {
		return super.perInfo() + "\t" + dept;
	}
}
