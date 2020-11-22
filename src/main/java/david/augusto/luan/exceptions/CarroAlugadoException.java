package david.augusto.luan.exceptions;


public class CarroAlugadoException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public  CarroAlugadoException() {
		super("Operação não realizda, carro ja se encontra alugado!");
	}
}
