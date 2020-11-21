package david.augusto.luan.entidades;

import java.util.ArrayList;
import java.util.List;

import david.augusto.luan.interfaces.LocadoraCarros;
import lombok.Getter;

@lombok.Data
@Getter
public abstract class Locadora implements LocadoraCarros{

	private List<Carro> carros;

	public Locadora() {
		this.carros = new ArrayList<Carro>();
	}

	@Override
	public void adicionarCarro(String modelo, String marca, int ano, double diaria) {
		
		
	}

	@Override
	public List<String> listarCarroDaMarca(String modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removerCarro(String modelo, String marca, int ano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
