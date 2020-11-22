package david.augusto.luan.entidades;

public class Movida extends Locadora {

	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) {
		carro.isAlugado();
		double total = 30;
		return (total * 0.10) + 30;
	}

}
