package david.augusto.luan.interfaces;

import java.util.List;

import david.augusto.luan.entidades.Carro;
import david.augusto.luan.entidades.Data;

public interface LocadoraCarros {

	public void adicionarCarro(String modelo, String marca, int ano, double diaria);
	
	public List<Carro> listarCarroDaMarca(String modelo);
	
	public void removerCarro(String modelo, String marca, int ano);
	
	public double alugarCarro(Carro carro, Data dataInicio, Data dataFim);
}
