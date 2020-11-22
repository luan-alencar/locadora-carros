package david.augusto.luan.entidades;

import david.augusto.luan.exceptions.CarroAlugadoException;

public class Localiza extends Locadora{

	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) throws CarroAlugadoException {
		if(carro.isAlugado() == true) {
			throw new  CarroAlugadoException();
		}
		carro.isAlugado();
		double total = 30;
		return (total * 0.20) + 30;
	}

	
}
