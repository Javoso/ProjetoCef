package br.com.CEF.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class ClienteInterno implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private int matricula;
	
	@Column(nullable=false)
	private String descricaoAlergica;
	
	@Transient
	private List<Endereco> enderecos = new ArrayList<>();

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getDescricaoAlergica() {
		return descricaoAlergica;
	}

	public void setDescricaoAlergica(String descricaoAlergica) {
		this.descricaoAlergica = descricaoAlergica;
	}

	public List<Endereco> getEndereco() {
		return enderecos;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.enderecos = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteInterno other = (ClienteInterno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n matricula " + this.matricula + "\n descricaoAlergica " + this.descricaoAlergica;
	}

}
