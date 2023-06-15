package dominio;

public class Main {

	public static void main(String[] args) {

		Producto telefono = new Producto(1);

		Producto mesa = new Producto(20);

		Producto auto = new Producto(1000);

		Envio correoArgentino = new CorreoArgentino();
		Envio colectivoSur = new ColectivoSur();

		System.out.println(correoArgentino.costoEnvio("buenos aires", telefono.peso()));

		System.out.println(colectivoSur.costoEnvio("capital federal", mesa.peso()));

		System.out.println(correoArgentino.costoEnvio("viedma", auto.peso()));

	}

}
