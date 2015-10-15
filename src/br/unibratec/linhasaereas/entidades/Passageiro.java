package br.unibratec.linhasaereas.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Passageiro {
	
	@Id
	private String		aCPF;
	
	private String		aNome;
	private String		aEMail;
	
	@Temporal(TemporalType.DATE)
	private Date		aDataNascimento;
	
	@Column(
		name="NM_TESTE",
		length=100,
		unique=true,
		nullable=true,
		//columnDefinition="VARCHAR(45)",
		insertable=true,
		updatable=true,
		precision=2,
		scale=2
	)
	private String testeColuna;
	
	private boolean		aIsPortadorNecessidadesEspeciais;
	
	public Passageiro() {}
	public Passageiro(
		String		aNome,
		String		aCPF, 
		String		aEMail, 
		Date		aDataNascimento,
		boolean		aIsPortadorNecessidadesEspeciais
	) {
		this.aCPF = aCPF;
		this.aNome = aNome;
		this.aEMail = aEMail;
		this.aDataNascimento = aDataNascimento;
		this.aIsPortadorNecessidadesEspeciais = aIsPortadorNecessidadesEspeciais;
	}
	
	public String getaCPF() {
		return aCPF;
	}
	public void setaCPF(String aCPF) {
		this.aCPF = aCPF;
	}
	public String getaNome() {
		return aNome;
	}
	public void setaNome(String aNome) {
		this.aNome = aNome;
	}
	public String getaEMail() {
		return aEMail;
	}
	public void setaEMail(String aEMail) {
		this.aEMail = aEMail;
	}
	public Date getaDataNascimento() {
		return aDataNascimento;
	}
	public void setaDataNascimento(Date aDataNascimento) {
		this.aDataNascimento = aDataNascimento;
	}
	public boolean isaIsPortadorNecessidadesEspeciais() {
		return aIsPortadorNecessidadesEspeciais;
	}
	public void setaIsPortadorNecessidadesEspeciais(boolean aIsPortadorNecessidadesEspeciais) {
		this.aIsPortadorNecessidadesEspeciais = aIsPortadorNecessidadesEspeciais;
	}
	
	
	
}
