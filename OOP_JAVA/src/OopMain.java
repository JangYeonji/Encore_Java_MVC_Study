import test.model.vo.ManagerVO;
import test.model.vo.PersonVO;
import test.model.vo.StudentVO;
import test.model.vo.TeacherVO;
import test.service.BusinessServiceImpl;

public class OopMain {

	public static void main(String[] args) {
//		//부모에 대한 객체생성은 의미 없음
//		StudentVO stu = new StudentVO("장연지",24,"서울","2017");
//		System.out.println(stu.stuInfo());
//		System.out.println(stu.perInfo());
//		
//		TeacherVO tea = new TeacherVO("임정섭",49,"광주","자바");
//		System.out.println(tea.teaInfo());
//		
//		ManagerVO emp = new ManagerVO("공영진",30,"서울","교육");
//		System.out.println(emp.empInfo());
		
		BusinessServiceImpl service = new BusinessServiceImpl();
		
		service.makePer(1, "장연지", 24, "제주", "2017");
		service.makePer(2, "임정섭", 49, "서울", "자바");
		service.makePer(3, "공영진", 30, "대전", "교육");
		
		PersonVO [] ary = service.getAry();
		for(int idx=0; idx<ary.length; idx++) {
			PersonVO per = ary[idx];
			if (per==null) {
				break;
			}
			System.out.println(per.perInfo());
		}
	}

}
