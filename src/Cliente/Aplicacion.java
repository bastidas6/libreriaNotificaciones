package Cliente;

import java.io.*;
import java.util.Scanner;

import FuncionalidadesNotificadores.Funcionalidades;
import FuncionalidadesNotificadores.NotificadorCorreoEmpresarial;
import FuncionalidadesNotificadores.NotificadorCorreoPersonal;
import FuncionalidadesNotificadores.NotificadorFacebook;
import FuncionalidadesNotificadores.NotificadorSMS;
import Libreria.EnviarNotificacion;
import Libreria.Notificador;

public class Aplicacion {

	public static void main(String[] args) {
		Scanner teclado1 = new Scanner(System.in);
		
		
		System.out.println("Cu�l es el mensaje que quiere enviar?");
		String mensaje = teclado1.next();
		System.out.println("opci�n 1: Facebook");
		System.out.println("opci�n 2: Correo personal");
		System.out.println("opci�n 3: Correo empresarial");
		System.out.println("opci�n 4: SMS");
		System.out.println("opci�n 5: varias opciones");
		System.out.println("Escoja una o varias opciones");

		Scanner teclado = new Scanner(System.in);
		int opcion = teclado.nextInt();

		switch (opcion) {
		case 1:
			Notificador carro = new NotificadorFacebook(new EnviarNotificacion("\n" + mensaje));
			System.out.println(carro.enviar());
			break;

		case 2:
			Notificador carro1 = new NotificadorSMS(new EnviarNotificacion("\n" + mensaje));
			System.out.println(carro1.enviar());
			break;
		case 3:
			Notificador carro2 = new NotificadorCorreoEmpresarial(new EnviarNotificacion("\n" + mensaje));
			System.out.println(carro2.enviar());
			break;

		case 4:
			Notificador carro3 = new NotificadorCorreoPersonal(new EnviarNotificacion("\n" + mensaje));
			System.out.println(carro3.enviar());
			break;

		case 5:
			Scanner teclado2 = new Scanner(System.in);
			System.out.println("Ingrese el �rden que quiera");
			int opcion2 = teclado2.nextInt();
			System.out.println("El �rden es:" + opcion2);
			break;

		}

		// String mensaje = teclado.nextLine(); System.out.print(mensaje);

		// Notificador carro = new EnviarNotificacion("cualquier cosa");
		// System.out.println(carro.enviar());

		// Notificador carro = new NotificadorCorreoEmpresarial(new
		// EnviarNotificacion(""));
		// System.out.println(carro.enviar());

		// Notificador carro = new NotificadorCorreoEmpresarial(new
		// NotificadorFacebook(new EnviarNotificacion("")) );
		// System.out.println(carro.enviar());
	}

}
