package DOO.DD.DD00.v002extensible;

public class Camarero implements VisitadorPersona {

	public void servir(Persona persona) {
		persona.aceptar(this);
	}

	@Override
	public void visitar(Mujer mujer) {
		System.out.println("CLASE_CAMARERO Soy un camarero que invita a un coktail");
		System.out.println("CLASE_CAMARERO Soy un camarero que entrega la comida");
	}

	@Override
	public void visitar(Hombre hombre) {
		System.out.println("CLASE_CAMARERO Soy un camarero que entrega la comida");
		System.out.println("CLASE_CAMARERO Soy un camarero que invita a un coñac");
	}
	
	public void recoger() {
		System.out.println("CLASE_CAMARERO Soy un camarero que recoge la mesa");
	}

}
