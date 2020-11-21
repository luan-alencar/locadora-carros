package david.augusto.luan.entidades;

import java.util.List;

import david.augusto.luan.interfaces.LocadoraCarros;
import lombok.Getter;
import lombok.NoArgsConstructor;

@lombok.Data
@Getter @NoArgsConstructor
public class Data implements LocadoraCarros {
	
	private int dia;
	private int mes;
	
	public Data(int dia, int mes) {
		
	}

	@Override
	public void adicionarCarro(String modelo, String marca, int ano, double diaria) {
		// TODO Auto-generated method stub
		
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
