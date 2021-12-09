import test.thread.Prt;
import test.thread.PrtThread;

public class ThreadMain {

	public static void main(String[] args) {
//		System.out.println("main start");
//		
//		//메인 내에서 실행
//		PrtThread runn2 = new PrtThread();
//		runn2.run();
//
//		//메인과 별개로 자기 작업을 사용. 메인도 스레드로 작용하기 때문
//		PrtThread runn = new PrtThread();   
//		Thread thread = new Thread(runn);
//		thread.start();
//	
//		
//		System.out.println("main end");
		
		
		Prt monitor = new Prt();
		
		PrtThread runn01 = new PrtThread('D', monitor);
		Thread thread01 = new Thread(runn01);
		thread01.start();
		
		PrtThread runn02 = new PrtThread('B', monitor);
		Thread thread02 = new Thread(runn02);
		thread02.start();
	}

}
