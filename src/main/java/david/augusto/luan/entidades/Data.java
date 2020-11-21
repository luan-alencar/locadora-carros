package david.augusto.luan.entidades;

import lombok.Getter;
import lombok.NoArgsConstructor;

@lombok.Data
@Getter @NoArgsConstructor
public class Data {
	
	private int dia;
	private int mes;
	
	public Data(int dia, int mes) {
		
	}
	
}
