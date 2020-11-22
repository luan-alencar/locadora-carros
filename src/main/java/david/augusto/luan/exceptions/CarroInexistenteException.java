package david.augusto.luan.exceptions;

public class CarroInexistenteException extends Exception {
	private static final long serialVersionUID = 1L;

	public CarroInexistenteException() {
		super("OPeração não realizada, carro inexistente!");
	}
}
