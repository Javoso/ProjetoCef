package br.com.CEF.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class ClienteExterno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String descricaoAlergica;

	@NotNull
	@Column(nullable = false)
	private String CPF;

	@OneToMany(mappedBy = "clienteExterno", cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricaoAlergica() {
		return descricaoAlergica;
	}

	public void setDescricaoAlergica(String descricaoAlergica) {
		this.descricaoAlergica = descricaoAlergica;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ClienteExterno other = (ClienteExterno) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n Nome " + this.nome + "\n descricaoAlergica " + this.descricaoAlergica + "\n CPF " + this.CPF;
	}

}
