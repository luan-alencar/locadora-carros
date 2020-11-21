package david.augusto.luan.entidades;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class Carro {

	private String modelo;
	private String marca;
	private int ano;
	private double diaria;
	private boolean alugado;

	// este construtor não haverá o atributo alugado pois um carro não possui uma
	// caracterista "alugado", mas apenas um "estado"
	public Carro(String modelo, String marca, int ano, double diaria) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.diaria = diaria;
	}

	public void setAlugado() {
		this.alugado = true;
	}

}
