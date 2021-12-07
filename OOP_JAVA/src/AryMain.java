import test.model.vo.ManagerVO;
import test.model.vo.PersonVO;
import test.model.vo.StudentVO;
import test.model.vo.TeacherVO;

public class AryMain {

	public static void main(String[] args) {
//		int [] intAry = new int [10];
//		for(int i=0; i<10; i++) {
//			System.out.println(intAry[i]);
//		}
		
		PersonVO [] stuAry = new PersonVO [10];   //다형성이 배열에 적용되면 부모타입이 자식타입을 관리할 수 있음
		stuAry[0] = new StudentVO("장연지",24,"제주","2017");
		stuAry[1] = new TeacherVO("임정섭",49,"광주","자바");
		stuAry[2] = new ManagerVO("공영진",30,"서울","교육");
		
		for(int i=0; i<stuAry.length; i++) {
			PersonVO per = stuAry[i];
			if(per != null) {
				if (per instanceof StudentVO) {
					System.out.println( ((StudentVO)per).stuInfo());
				}
				if (per instanceof TeacherVO) {
					System.out.println( ((TeacherVO)per).teaInfo());
				}
				if (per instanceof ManagerVO) {
					System.out.println( ((ManagerVO)per).empInfo());
				}
			}
		}
	}

}
