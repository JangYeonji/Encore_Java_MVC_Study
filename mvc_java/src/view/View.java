package view;

import java.util.List;
import java.util.Scanner;

import ctrl.front.FrontController;
import model.vo.BbsVO;
import model.vo.FilterVO;

public class View {
	private FrontController fc;
	private int articleSeq;
	public View() {
		fc = new FrontController();
	}
	public void mainMenu() {
		while(true) {
			System.out.println(">> MVC BBS Ver1.0<<");
			System.out.println("1. 게시물 작성");
			System.out.println("2. 게시물 수정");
			System.out.println("3. 게시물 삭제");
			System.out.println("4. 게시물 목록");
			System.out.println("5. 게시물 상세");
			System.out.println("6. 게시물 찾기");
			System.out.println("99. 프로그램 종료");
			System.out.print("SELECT NUMBER ==> ");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			switch(number) {
			case 1:
				insert(); break;
			case 2:
				update(); break;
			case 3:
				delete(); break;
			case 4:
				select(); break;
			case 5:
				read(); break;
			case 6:
				search(); break;
			case 99:
				System.exit(1);
			}
		}
	}
	
	public void insert() {
		System.out.println(">>게시물 작성<<");

		Scanner scan = new Scanner(System.in);
		System.out.print("제목 : ");
		String subject = scan.nextLine();
		System.out.print("내용 : ");
		String content = scan.nextLine();
		System.out.print("작성자 : ");
		String writer = scan.nextLine();
		
		BbsVO bbs = new BbsVO();
		bbs.setSubject(subject);
		bbs.setContent(content);
		bbs.setWriter(writer);
		
		Object result = fc.requestProc(1, bbs);
		
		System.out.println("insert result : " + result);
	}
	public void update() {
		System.out.println();
		System.out.println(">>게시물 수정<<");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수정할 제목 : ");
		String subject = scan.nextLine();
		System.out.print("수정할 내용 : ");
		String content = scan.nextLine();
		
		BbsVO bbs = new BbsVO();
		bbs.setSeq(articleSeq);
		bbs.setSubject(subject);
		bbs.setContent(content);
		
		Object result = fc.requestProc(2, bbs);
		System.out.println("updqte result : " + result);
	}
	public void delete() {
		System.out.println();
		System.out.println(">>게시물 삭제<<");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("게시글 번호(SEQ) : ");
		int seq = scan.nextInt();
		
		BbsVO bbs = new BbsVO();
		bbs.setSeq(seq);
		Object result = fc.requestProc(3, bbs);
		
		System.out.println("delete result : " + result);
	}
	public void select() {
		System.out.println(">>게시물 목록<<");
		List<Object> list = (List<Object>)fc.requestProc(4, null);
		for(Object obj : list) {
			System.out.println(((BbsVO)obj).info());
		}
	}
	public void read() {
		System.out.println();
		System.out.println(">>게시물 상세<<");
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("게시글 번호(SEQ) : ");
		int seq = scan.nextInt();
		
		BbsVO bbs = new BbsVO();
		bbs.setSeq(seq);
		Object obj = fc.requestProc(5, bbs);
		System.out.println(((BbsVO)obj).info());
		
		//수정을 위한 게시글 번호를 저장하는 코드
		articleSeq = ((BbsVO)obj).getSeq();
	}
	public void search() {
		System.out.print("필터조건 입력(제목 or 작성자) ");
		Scanner scan = new Scanner(System.in);
		String searchCondition = scan.nextLine();
		
		System.out.print("검색 키워드 입력 >>> ");
		String searchKeyword = scan.nextLine();
		
		FilterVO filter = new FilterVO(searchCondition, searchKeyword);
		List<Object> list = (List<Object>)fc.requestProc(6, filter);
		if (list != null) {
			for (Object obj : list) {
				System.out.println(((BbsVO)obj).info());
			}
		}
		
	}
}
