package FuncionalidadesNotificadores;
import Libreria.Notificador;

public class NotificadorCorreoPersonal extends Funcionalidades {
	
	Notificador notificador;

	public NotificadorCorreoPersonal(Notificador notificador) {
		this.notificador = notificador;
	}

	@Override
	public String enviar() {
		return "\nSe ha enviado el mensaje por correo personal" + notificador.enviar();
	}

}
