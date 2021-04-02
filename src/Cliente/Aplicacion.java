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


//En el main le pedimos al usuario que ingrese el mensaje y la opci�n por la cual quiere enviar este mensaje.

public class Aplicacion {

	private static final String List = null;

	public static void main(String[] args) {

		String mensaje;

		Scanner teclado1 = new Scanner(System.in);
		
		//Ac� le pedimos al usuario que mensaje quiere enviar.

		System.out.println("Cu�l es el mensaje que quiere enviar?");
		mensaje = teclado1.nextLine();
        
		//Ac� le pedimos el medio por el cual quiere enviar el mensaje
		System.out.println("opci�n 1: Facebook");
		System.out.println("opci�n 2: Correo personal");
		System.out.println("opci�n 3: Correo empresarial");
		System.out.println("opci�n 4: SMS");
		System.out.println("opci�n 5: Correo personal, correo empresarial y facebook");
        
		
		//Ac� verificamos que la opci�n sea v�lida
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

			//Aqu� hicimos un caso hipot�tico dado el caso de que el usuario quiera enviar el mensaje por Facebook o SMS
			case "5":
				Notificador notificacion4 = new NotificadorCorreoPersonal(
						new NotificadorCorreoEmpresarial(new NotificadorFacebook(new EnviarNotificacion("\n" + mensaje))));
				System.out.println(notificacion4.enviar());
				break;

			}
		}else {
			System.out.println("Escoja una opci�n valida");
		}
		

	}
	

}
