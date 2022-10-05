package br.com.CEF.Controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.CEF.Model.Categoria;
import br.com.CEF.Model.Medicamento;

@Named
@ViewScoped
public class CadastroMedicamentoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Medicamento medicamento;

	@Inject
	private EntityManager manager;

	private List<Categoria> categoriasRaizes;

	public CadastroMedicamentoBean() {
		medicamento = new Medicamento();
	}

	public void inicializar() {
		System.out.println("inicializando");
		categoriasRaizes = manager.createQuery("from Categoria", Categoria.class).getResultList();
		manager.close();
	}

	public void salvar() {

	}
	
	public Medicamento getMedicamento() {
		return medicamento;
	}

	public List<Categoria> getCategoriasRaizes() {
		return categoriasRaizes;
	}
	
	
}
