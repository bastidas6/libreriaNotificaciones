package FuncionalidadesNotificadores;

import Libreria.Notificador;

public class NotificadorFacebook extends Funcionalidades {

	Notificador notificador;

	public NotificadorFacebook(Notificador notificador) {
		this.notificador = notificador;
	}

	@Override
	public String enviar() {

		return "\nSe ha enviado el mensaje por Facebook" + notificador.enviar();
	}

}
