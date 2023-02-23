package realfooding;

public abstract class Comida {

	protected int calorias;
	protected String nombre;

	public Comida(int calorias, String nombre) {
		super();
		this.calorias = calorias;
		this.nombre = nombre;
	}
	
	public abstract String procedencia();
	public abstract boolean saludable();

}
