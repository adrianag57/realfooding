package realfooding;

public class Start {

	public static void main(String[] args) {
		
		Comida[] realFood = new Comida[10];
		
		realFood[0] = new Carne(1000, "Filete", true);
		realFood[1] = new Verdura(50, "Patata", true, false);
		realFood[2] = new Fruta(100, "Manzana", 5, false);
		realFood[3] = new Carne(1500, "Chorizo", true);
		realFood[4] = new Fruta(23, "Pera", 27, true);
		realFood[5] = new Fruta(38, "Platano", 23, true);
		realFood[6] = new Carne(1300, "Jamon", true);
		realFood[7] = new Verdura(63, "Boniato", true, false);
		realFood[8] = new Verdura(30, "Lechuga", true, true);
		realFood[9] = new Fruta(23, "Melon", 60, false);
		
		for (Comida alimento : realFood) {
			
			System.out.println(alimento.procedencia());
			System.out.println(alimento.saludable());
			System.out.println("--------------");
		}

	}

}
