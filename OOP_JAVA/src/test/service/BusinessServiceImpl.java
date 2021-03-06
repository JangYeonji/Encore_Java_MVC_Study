package test.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import test.model.util.LTV;
import test.model.util.STV;
import test.model.util.TV;
import test.model.vo.ManagerVO;
import test.model.vo.PersonVO;
import test.model.vo.StudentVO;
import test.model.vo.TeacherVO;

/*
 * 업무로직을 처리하는 클래스
 * vo 객체를 생성하고 관리(배열)하는 업무를 수행
 * 수정, 삭제, 찾기 
 * */

public class BusinessServiceImpl {   //interface를 구현하고 있는 클래스
//	private PersonVO [] perAry;
//	private int idx; 
	private List<PersonVO> perAry;   //2줄을 1줄로
	
	public BusinessServiceImpl() {
//		perAry = new PersonVO [10];   //1줄을 1줄로
		perAry = new ArrayList<PersonVO>();
	}
	
	/* 인자로 들어온 값을 받고 division을 구분하여 각 타입의 객체를 생성하고 배열에 저장하려고 한다.
	 * division 1=stu, 2=tea, 3=man
	 * 배열에 저장할 때는 구현된 setAry() 호출하면 된다.
	 * */
	public void makePer(int division, String name, int age, String address, String comm) {
		PersonVO per = null;
		switch(division) {
		case 1:
			per = new StudentVO(name,age,address,comm);
			break;   //필수
		case 2:
			per = new TeacherVO(name,age,address,comm);
			break;
		case 3:
			per = new ManagerVO(name,age,address,comm);
			break;
		}
		setAry(per);   //case문 안에 넣을 필요 없음
			
	}
	
	public void setAry(PersonVO per) {
//		perAry[idx++] = per;
		perAry.add(per);
	}
	
//	public PersonVO[] getAry() {
	public List<PersonVO> getAry(){
		return perAry;
	}

	public PersonVO searchPer(String name) {
		PersonVO per = null;
		Iterator<PersonVO> ite = perAry.iterator();
		while(ite.hasNext()) {
			PersonVO entity = ite.next();
			if (entity.getName().equals(name)) {   //위의 문장과 하나로 합칠 수 있음
				per = entity;
				break;
			}
		}
		return per;
	}
}
