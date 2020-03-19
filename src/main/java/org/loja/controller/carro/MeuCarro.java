package org.loja.controller.carro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.loja.entity.Carro;

public class MeuCarro {

	private static List<Carro> carros = new ArrayList<Carro>() ;
	private static Carro carro = new Carro();

	
	private static int auto = 0;

	public static int getAuto() {
		auto = auto + 1;
		return auto;
	}

	public static List<Carro> getCarros() {
		return carros;
	}
	
	public void remove(String numero) {
		for (int i=0; i < carros.size(); i++) {
			Carro carro = (Carro)carros.get(i);
			if (Objects.equals(carro.getValue(), numero)) {
				carros.remove(i);
			}
		}		
		
		MeuCarro.setCarros(carros);
	}
    public static void setCarros(List<Carro> carros) {
		MeuCarro.carros = carros;
	}
	public static void comprandoItem() {
		carros.add(carro);
		//carro = null;
	}

	public static void setCarro(Carro carro) {
		MeuCarro.carro = carro;
	}

	public static Carro getCarro() {
		return carro;
	}

}
