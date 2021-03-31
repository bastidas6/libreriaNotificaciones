package Libreria;

public class EnviarNotificacion implements Notificador {
	
	private String mensaje;

	public EnviarNotificacion(String mensaje) {
		
		this.mensaje = mensaje;

	}

	@Override
	public String enviar() {
		return mensaje;
	}

}
