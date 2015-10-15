package br.unibratec.linhasaereas.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.unibratec.linhasaereas.entidades.Passageiro;
import br.unibratec.persistencia.AbstractDAO;
import br.unibratec.util.UtilJPA;

public class PassageiroDAO extends AbstractDAO implements IPassageiroDAO {
	
	public Passageiro consultar(Object pChavePrimaria) {
		Passageiro registro = 
			(Passageiro) super.consultar(
							Passageiro.class, 
							pChavePrimaria);
		
		return registro;
	}
	
	public void persistirPassageiro(Passageiro pPassageiro) {
		EntityManager manager = UtilJPA.getEntityManager();
		EntityTransaction transacao = manager.getTransaction();
		transacao.begin();
		
		manager.persist(pPassageiro);
		
		transacao.commit();
		manager.close();
		
		UtilJPA.closeEntityManagerFactory();
		
		System.out.println("Fabrica de Conex�es JPA fechada com sucesso!");
	}

	public void testarConexaoJDBC() {
		IConnectionFactory conexao = new ConnectionFactory();
		conexao.getConnection();
	}
	
}
