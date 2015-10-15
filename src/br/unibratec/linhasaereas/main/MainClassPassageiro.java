package br.unibratec.linhasaereas.main;

import br.unibratec.linhasaereas.fachada.Fachada;
import br.unibratec.linhasaereas.fachada.IFachada;
import br.unibratec.util.ConstantesGerais;

public class MainClassPassageiro {
	
	public static void main(String[] args) {
		inserirPassageiro();
		consultarPassageiro();
	}
	
	public static void consultarPassageiro() {
		IFachada fachada = new Fachada();
		fachada.consultar(ConstantesGerais.CPF_123_456_789_01);
	}

	private static void inserirPassageiro() {
		IFachada fachada = new Fachada();
		
		fachada.inserirPassageiro(
			"Pedro Santos", 
			ConstantesGerais.CPF_123_456_789_01, 
			"prof.pcfs@gmail.com", 
			"06/08/2015", 
			"false");
	}
	
}
