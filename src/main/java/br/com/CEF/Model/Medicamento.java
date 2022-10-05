package br.com.CEF.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import br.com.CEF.validator.SKU;

@Entity
public class Medicamento implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@NotBlank @SKU
	@Column(nullable = false, length = 20, unique = true)
	private String sku;

	@NotBlank
	@Size(max = 80)
	@Column(nullable = false, length = 80)
	private String nome;

	@NotBlank
	@Column(nullable = false)
	private String marca;

	@NotBlank
	@Column(nullable = false)
	private String lote;

	@NotNull
	@ManyToOne
	private Fornecedor fornecedor;

	@NotNull
	@Column(nullable = false, precision = 10, scale = 2)
	private double precoVenda;

	@NotNull
	@Column(nullable = false, precision = 10, scale = 2)
	private double precoCompra;

	@NotNull
	@Min(0)
	@Max(value = 9999, message=" tem um valor muito alto" )
	@Column(nullable = false, length = 5)
	private int quantidade;

	@NotNull
	@Column(nullable = false)
	private Date dataCompra;

	@NotNull
	@Column(nullable = false)
	private Date validade;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku == null ? null : sku.toUpperCase();
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
		Medicamento other = (Medicamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n sku " + this.sku + "\n nome " + this.nome + "\n marca " + this.marca + "\n lote " + this.lote
				+ "\n CNPJ do fornecedor " + this.fornecedor.getCnpj() + "\n precoVenda " + this.precoVenda
				+ "\n precoCompra " + this.precoCompra + "\n quantidade " + this.quantidade + "\n dataCompra="
				+ this.dataCompra + "\n validade " + this.validade;
	}
}
