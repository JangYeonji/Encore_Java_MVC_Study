import test.factory.BeanFactory;
import test.model.util.LTV;
import test.model.util.TV;

public class InterfaceMain {   //클라이언트

	public static void main(String[] args) {
//		TV tv = new LTV();
//		tv.turnOn();
		
		BeanFactory factory = BeanFactory.getInstance();
//		System.out.println("address - "+factory);
//		
//		BeanFactory factory1 = BeanFactory.getInstance();
//		System.out.println("address - "+factory1);
		
		TV tv = factory.getBrand("lg");
		tv.turnOn();
	}

}
