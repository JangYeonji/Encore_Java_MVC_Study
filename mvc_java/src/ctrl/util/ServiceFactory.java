package ctrl.util;

import java.util.HashMap;
import java.util.Map;

import service.BbsService;
import service.BbsServiceImpl;

public class ServiceFactory {
	private static ServiceFactory instance;
	private Map<String, BbsService> map;
	private ServiceFactory() {
		map = new HashMap<>();
		map.put("bbs",new BbsServiceImpl());
	}
	public static ServiceFactory getInstance() {
		return d;
	}
}
