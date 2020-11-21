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
		Carro carro = new Carro(modelo, marca,ano, diaria);
		carros.add(carro);
	}

	@Override
	public List<String> listarCarroDaMarca(String modelo) {
		
		for (Carro c : carros) {
			if (c.getModelo().equals(modelo)) {
		
			}
		}
		return null;
	}

	@Override
	public void removerCarro(String modelo, String marca, int ano) {
		for (Carro c : carros) {
			if (c.getModelo().equals(modelo) && c.getMarca().equals(marca) && c.getAno() == ano) {
				carros.remove(c);
			}
		}
		
	}

	@Override
	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
