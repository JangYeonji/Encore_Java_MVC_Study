package test.thread;

public class Prt {
	public synchronized void printChar(char charValue) {   //충돌을 예방하기 위한 synchronized. 10*1
		for(int i=0;i<10;i++) {
			System.out.print(charValue);
		}
	}
}
