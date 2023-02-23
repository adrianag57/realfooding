package realfooding;

public class Salchicha extends Carne {

	public Salchicha(int calorias, String nombre, boolean carneRoja) {
		super(calorias, nombre, true);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean saludable() {
		
		return false;
	}

}
