package br.unibratec.linhasaereas.fachada;

import br.unibratec.linhasaereas.entidades.Passageiro;

public interface IFachada {

	public void inserirPassageiro(
		String	pNome,
		String	pCPF,
		String	pEMail,
		String	pData,
		String	pIsPortadorNecessidadesEspeciais
	);
	
	public void inserir(Passageiro pPassageiro);
	public void consultar(Object pChavePrimariaPassageiro);
	
}
