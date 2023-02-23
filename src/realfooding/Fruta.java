package realfooding;

public class Fruta extends Comida {

	private int azucar;
	private boolean deshidratada;

	public Fruta(int calorias, String nombre, int azucar, boolean deshidratada) {
		super(calorias, nombre);
		this.azucar = azucar;
		this.deshidratada = deshidratada;
	}

	@Override
	public String procedencia() {

		return nombre + " Vegano";
	}

	@Override
	public boolean saludable() {

		boolean saludable = true;
		if (azucar > 25) {

			saludable = false;
		}

		return saludable;
	}

}
