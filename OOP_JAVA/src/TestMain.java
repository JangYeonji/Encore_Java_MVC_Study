import test.model.dao.TestDAO;
import test.model.vo.TestVO;
import test.view.TestView;

public class TestMain {

	public static void main(String[] args) {
		TestView view = new TestView();   //생성자 호출. 클래스는 설계도면, 인스턴스는 호출는 건물 쌓기
		view.mainMenu();
		
//		TestVO instance = new TestVO();   
//		instance.setName("jslim");
//		instance.setAge(49);
//		instance.setAddress("seoul");
		
//		String info = instance.info();
//		System.out.println(info);
		
//		TestDAO dao = new TestDAO();
//		int flag = dao.insertRow(instance);
//		if (flag != 0) {
//			System.out.println("1 row insert ok!!");
//		}else {
//			System.out.println("1 row insert error!!");
//		}
	}

}
