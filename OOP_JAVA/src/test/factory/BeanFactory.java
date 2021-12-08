package test.factory;

import java.util.HashMap;
import java.util.Map;

import test.model.util.LTV;
import test.model.util.STV;
import test.model.util.TV;

public class BeanFactory {
	private static BeanFactory instance;
	
//	private TV[] ary;
	private Map<String, TV> ary ;

	private BeanFactory() {
//		ary = new TV[2];
		ary = new HashMap<String, TV>(); 
//		ary[0] = new LTV();
//		ary[1] = new STV();
		ary.put("samsung", new STV());
		ary.put("lg", new LTV());
	}
	
	public synchronized static BeanFactory getInstance() {
		if(instance==null) {
			instance = new BeanFactory();
		}
		return instance;
	}
	public TV getBrand(String brand) {
//		TV tv = brand.equals("samsung") ? ary[1] : ary[0];
		TV tv = ary.get(brand);
		return tv;
	}
}
