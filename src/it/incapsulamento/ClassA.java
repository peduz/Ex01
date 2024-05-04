package it.incapsulamento;

public class ClassA {

	public void usaSingleton() { 
		Singleton s = Singleton.getInstance();
	}
	
	//Metodo che saluta con la stringa "ciao"
	public void saluto() {
		System.out.println("Ciao");
	}
	
	//Metodo privato
	private void interno() {
		System.out.println("Da fuori non mi vedono");
	}
	
	protected void inPackage() {
		System.out.println("Mi vedono nel package");
	}
	
	void inPackage2() {
		System.out.println("Mi vedono nel package");		
	}
	
}
