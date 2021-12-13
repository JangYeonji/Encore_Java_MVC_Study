import ctrl.front.FrontController;
import view.View;

public class BbsMain {

	public static void main(String[] args) {
//		FrontController fc = new FrontController();   //view 대신
//		fc.requestProc(1);
		
		View view = new View();
		view.mainMenu();
	}

}
