package FuncionalidadesNotificadores;
import Libreria.Notificador;

public class NotificadorCorreoEmpresarial extends Funcionalidades {
	
	Notificador notificador;

	public NotificadorCorreoEmpresarial(Notificador notificador) {
		this.notificador = notificador;
	}

	@Override
	public String enviar() {
		return "\nSe ha enviado el mensaje por correo empresarial" + notificador.enviar();
	}

}
