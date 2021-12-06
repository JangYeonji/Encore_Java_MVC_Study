import test.model.vo.StudentVO;

public class OopMain {

	public static void main(String[] args) {
		//부모에 대한 객체생성은 의미 없음
		StudentVO stu = new StudentVO("jyj",24,"서울","2017");
		System.out.println(stu.stuInfo());
		System.out.println(stu.perInfo());
	}

}
