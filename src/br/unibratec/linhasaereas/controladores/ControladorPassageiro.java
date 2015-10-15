package br.unibratec.linhasaereas.controladores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.unibratec.linhasaereas.entidades.Passageiro;
import br.unibratec.linhasaereas.persistencia.IPassageiroDAO;
import br.unibratec.linhasaereas.persistencia.PassageiroDAO;
import br.unibratec.util.BibliotecaFuncoes;

public class ControladorPassageiro implements IControladorPassageiro {
	
	public void inserirPassageiro(
		String	pNome,
		String	pCPF,
		String	pEMail,
		String	pDataNascimento,
		String	pIsPortadorNecessidadesEspeciais
	) {
		boolean isPortadorNecessidadesEspeciais = false;
		if ( 
				BibliotecaFuncoes.isStringValida(pIsPortadorNecessidadesEspeciais)		&&
				pIsPortadorNecessidadesEspeciais.equalsIgnoreCase(Boolean.TRUE.toString())
		) {
			isPortadorNecessidadesEspeciais = true;
		}
		
		Date dtNascimento = null;
		if ( BibliotecaFuncoes.isStringValida(pDataNascimento) ) {
			try {
				dtNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(pDataNascimento);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Passageiro passageiro = 
			new Passageiro(
					pNome,
					pCPF,
					pEMail,
					dtNascimento,
					isPortadorNecessidadesEspeciais
			);
		
		IPassageiroDAO passageiroDAO = new PassageiroDAO();
		passageiroDAO.inserir(passageiro);
	}
	
	public void inserir(Passageiro pPassageiro) {
		IPassageiroDAO passageiroDAO = new PassageiroDAO();
		passageiroDAO.inserir(pPassageiro);
	}
	
	public Passageiro consultar(Object pChavePrimaria) {
		IPassageiroDAO passageiroDAO = new PassageiroDAO();
		Passageiro registro = passageiroDAO.consultar(pChavePrimaria);
		return registro;
	}

}