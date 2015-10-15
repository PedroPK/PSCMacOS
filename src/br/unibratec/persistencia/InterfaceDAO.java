package br.unibratec.persistencia;

import javax.persistence.EntityManager;

import br.unibratec.entidades.Entidade;

public interface InterfaceDAO {
	
	public void inserir(Object pObject);
	public void inserir(Object pObject, EntityManager pEntityManager, boolean pFecharEntityManager);
	
	public void alterar(Object pObject);
	public void alterar(Object pObject, EntityManager pEntityManager, boolean pFecharEntityManager);
	
	
	public void excluirPorChavePrimaria(Class pClasse, Object pPrimaryKey);
	public void excluirPorChavePrimaria(Class pClasse, Object pPrimaryKey, EntityManager pEntityManager, boolean pFecharEntityManager);
	
	public void excluirPorObjeto(Class pClasse, Entidade pObjeto);
	public void excluirPorObjeto(Class pClasse, Entidade pObjeto, EntityManager pEntityManager, boolean pFecharEntityManager);
	
	public Entidade consultar(Class pClasse, Object pPrimaryKey);
	
}