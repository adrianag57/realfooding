package realfooding;

public class Carne extends Comida {

	private boolean carneRoja;

	public Carne(int calorias, String nombre, boolean carneRoja) {
		super(calorias, nombre);
		this.carneRoja = carneRoja;
	}

	@Override
	public String procedencia() {

		String origen = " Animal";
		return nombre + origen;
	}

	@Override
	public boolean saludable() {
		boolean saludable = false;
		if (!carneRoja && calorias<100) {

			saludable = true;
		}

		return saludable;
	}

}
