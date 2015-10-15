package br.unibratec.heranca.main;

import br.unibratec.entidades.Entidade;
import br.unibratec.heranca.singletable.entidades.AlunoSingleTable;
import br.unibratec.persistencia.DAOConcreto;
import br.unibratec.persistencia.InterfaceDAO;
import br.unibratec.util.ConstantesGerais;
import br.unibratec.util.UtilJPA;

public class SubMainAbstractDAO {
	
	public static void main(String[] args) {
		inserir();
		Entidade registro = consultar();
		
		alterar();
		excluirPorChavePrimaria( 
			registro.getChavePrimaria() 
		);
	}
	
	private static Entidade consultar() {
		InterfaceDAO dao = new DAOConcreto();
		
					// Tipo escolhido aleatoriamente
		return dao.consultar(AlunoSingleTable.class, ConstantesGerais.CPF_123_456_789_01);
	}
	
	private static void inserir() {
		InterfaceDAO dao = new DAOConcreto();
		dao.inserir(
			// Tipo escolhido aleatoriamente
			SubMainHerancaSingleTable.getInstanciaAlunoJoaoSingleTable()
		);
	}
	
	private static void alterar() {
		InterfaceDAO dao = new DAOConcreto();
		
		AlunoSingleTable alunoSingleTable = SubMainHerancaSingleTable.getInstanciaAlunoJoaoSingleTable();
		alunoSingleTable.setNome("David?");
		
		dao.alterar(
			// Tipo escolhido aleatoriamente
			alunoSingleTable
		);
	}
	
	private static void excluirPorObjeto() {
		InterfaceDAO dao = new DAOConcreto();
		dao.excluirPorObjeto(
			AlunoSingleTable.class, 
			SubMainHerancaSingleTable.getInstanciaAlunoJoaoSingleTable());
	}
	
	private static void excluirPorChavePrimaria(Object pChavePrimaria) {
		InterfaceDAO dao = new DAOConcreto();
		dao.excluirPorChavePrimaria(
			AlunoSingleTable.class, 
			pChavePrimaria);
	}
	
}