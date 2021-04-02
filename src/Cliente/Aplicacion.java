package Cliente;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import FuncionalidadesNotificadores.Funcionalidades;
import FuncionalidadesNotificadores.NotificadorCorreoEmpresarial;
import FuncionalidadesNotificadores.NotificadorCorreoPersonal;
import FuncionalidadesNotificadores.NotificadorFacebook;
import FuncionalidadesNotificadores.NotificadorSMS;
import Libreria.EnviarNotificacion;
import Libreria.Notificador;


//En el main le pedimos al usuario que ingrese el mensaje y la opción por la cual quiere enviar este mensaje.

public class Aplicacion {

	private static final String List = null;

	public static void main(String[] args) {

		String mensaje;

		Scanner teclado1 = new Scanner(System.in);
		
		//Acá le pedimos al usuario que mensaje quiere enviar.

		System.out.println("Cuál es el mensaje que quiere enviar?");
		mensaje = teclado1.nextLine();
        
		//Acá le pedimos el medio por el cual quiere enviar el mensaje
		System.out.println("opción 1: Facebook");
		System.out.println("opción 2: Correo personal");
		System.out.println("opción 3: Correo empresarial");
		System.out.println("opción 4: SMS");
		System.out.println("opción 5: Correo personal, correo empresarial y facebook");
        
		
		//Acá verificamos que la opción sea válida
		Scanner teclado = new Scanner(System.in);
		String opcion = teclado.next();
	    if (opcion.equals("1") || opcion.equals("2") || opcion.equals("3") || opcion.equals("4") || opcion.equals("5") )  {
			switch (opcion) {
			
			//Creamos los objetos de tipo notificador
			case "1":
				Notificador notificacion = new NotificadorFacebook(new EnviarNotificacion("\n" + mensaje));
				System.out.println(notificacion.enviar());
				break;

			case "2":
				Notificador notificacion1 = new NotificadorCorreoPersonal(new EnviarNotificacion("\n" + mensaje));
				System.out.println(notificacion1.enviar());
				break;
			case "3":
				Notificador notificacion2 = new NotificadorCorreoEmpresarial(new EnviarNotificacion("\n" + mensaje));
				System.out.println(notificacion2.enviar());
				break;

			case "4":
				Notificador notificacion3 = new NotificadorSMS(new EnviarNotificacion("\n" + mensaje));
				System.out.println(notificacion3.enviar());
				break;

			//Aquí hicimos un caso hipotético dado el caso de que el usuario quiera enviar el mensaje por Facebook o SMS
			case "5":
				Notificador notificacion4 = new NotificadorCorreoPersonal(
						new NotificadorCorreoEmpresarial(new NotificadorFacebook(new EnviarNotificacion("\n" + mensaje))));
				System.out.println(notificacion4.enviar());
				break;

			}
		}else {
			System.out.println("Escoja una opción valida");
		}
		

	}
	

}
