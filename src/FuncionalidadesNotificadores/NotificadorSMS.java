package FuncionalidadesNotificadores;
import Libreria.Notificador;


public class NotificadorSMS extends Funcionalidades {
	
	Notificador notificador;

	public NotificadorSMS(Notificador notificador) {
		this.notificador = notificador;
	}

	@Override
	public String enviar() {
		return "\nSe ha enviado el mensaje por SMS" + notificador.enviar();
	}

} 


