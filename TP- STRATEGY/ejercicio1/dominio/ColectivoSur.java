package dominio;

public class ColectivoSur implements Envio {

	public static final double capitalFederal = 1000;
	public static final double buenosAires = 1500;
	public static final double otroLugar = 3000;
	public static final double pesoEntre5y30 = 500;
	public static final double pesoMas30 = 2000;

	public ColectivoSur() {
	}

	@Override
	public double costoEnvio(String ciudad, double peso) {

		double resultado = this.costoCiudad(ciudad) + this.CostoPeso(peso);

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

	private double CostoPeso(double peso) {

		double resultado = 0;

		resultado = pesoEntre5y30(peso, resultado);
		resultado = pesoMas30(peso, resultado);

		return resultado;
	}

	private double pesoEntre5y30(double peso, double resultado) {
		if ((5 < peso) && (peso < 30)) {

			resultado = +pesoEntre5y30;

		}
		return resultado;
	}

	private double pesoMas30(double peso, double resultado) {
		if (peso > 30) {
			resultado = +pesoMas30;
		}
		return resultado;
	}

}
