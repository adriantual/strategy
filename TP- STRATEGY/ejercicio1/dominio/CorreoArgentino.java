package dominio;

public class CorreoArgentino implements Envio {
	public static final double capitalFederal = 500;
	public static final double buenosAires = 800;
	public static final double precioPorKilo = 5;
	public static final double otroLugar = 1000;

	public CorreoArgentino() {
	}

	@Override
	public double costoEnvio(String ciudad, double peso) {
		double resultado = this.costoCiudad(ciudad) + this.CostoPeso(peso);

		return resultado;
	}

	private double CostoPeso(double peso) {

		double resultado = peso * precioPorKilo;
		return resultado;
	}

	private double costoCiudad(String ciudad) {

		double resultado = 0;
		resultado = buenosAires(ciudad, resultado);
		resultado = capitalFederal(ciudad, resultado);
		resultado = otraCiudad(ciudad, resultado);

		return resultado;
	}

	private double otraCiudad(String ciudad, double resultado) {
		if ((ciudad != "buenos aires") && (ciudad != "capital federal")) {
			resultado = +otroLugar;
		}
		return resultado;
	}

	private double capitalFederal(String ciudad, double resultado) {
		if (ciudad == "capital federal") {
			resultado = +capitalFederal;

		}
		return resultado;
	}

	private double buenosAires(String ciudad, double resultado) {
		if (ciudad == "buenos aires") {

			resultado = +buenosAires;
		}
		return resultado;
	}

}
