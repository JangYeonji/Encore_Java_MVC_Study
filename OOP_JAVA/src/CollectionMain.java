import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import test.model.util.LTV;
import test.model.util.STV;
import test.model.util.TV;

public class CollectionMain {

	public static void main(String[] args) {
//		List list = new ArrayList();   //ArrayList는 List를 상속받기 때문
//		list.add(1);
//		list.add(true);
//		list.add("jyj");
//		list.add(new LTV());
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		List<TV> list = new ArrayList<TV>();
		list.add(new STV());
		list.add(new LTV());
		
		//방법1
		for (int i=0; i<list.size();i++) {
//			TV tv = list.get(i);
//			tv.turnOn();
			list.get(i).turnOn();   //2줄에서 1줄로,,
		}
		
		//방법2
		Iterator<TV> ite = list.iterator();
		while(ite.hasNext()) {
			ite.next().turnOn();
		}
		
	}

}
