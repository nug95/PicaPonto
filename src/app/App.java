package app;

import misc.MData;
import view.Principal;

public class App {

	public App(){
		Principal principal = new Principal();
		principal.setVisible(true);
	}
	public static void main(String[] args) {
		//MData.fillData();
		//MData.getData();
		App app = new App();
	}

}
