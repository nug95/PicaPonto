package misc;

import controller.GereCliente;
import model.Cliente;

public class MData {
	private static Cliente c1 = new Cliente("NunoG", "Nuno", "Garcia", "Rua", "912345678");
	private static GereCliente gc = new GereCliente();
	
	public static void fillData(){
		gc.addCliente(c1);
	}
	public static void getData(){
		System.out.println(gc.getArCliente().get(0).getUsername());
	}
}
