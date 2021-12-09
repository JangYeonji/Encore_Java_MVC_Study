package test.thread;

public class PrtThread implements Runnable{
	private char charValue;
	private Prt monitor;
	
	public PrtThread() {
		
	}
	public PrtThread(char charValue, Prt monitor) {
		this.charValue = charValue;
		this.monitor = monitor;
	}
	
	@Override
	public void run() {
//		for(int i=0; i<10; i++) {
//			System.out.println("thread - " + i);
//			try {
//				Thread.sleep(1000);
//			}catch(Exception e) {
//				e.printStackTrace();
//			};
//		}
		
		synchronized(monitor) {   //첫번째 모니터 먼저 실행할 수 있게 잠금. 10*10
			for(int i=0;i<10;i++) {
				monitor.printChar(charValue);
				System.out.println();
			}
		}
		
		
	}
	
}
