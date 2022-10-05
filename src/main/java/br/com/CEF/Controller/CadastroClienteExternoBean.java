package br.com.CEF.Controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.CEF.Model.ClienteExterno;
import br.com.CEF.Service.ClienteExternoService;

@Named
@ViewScoped
public class CadastroClienteExternoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	private ClienteExterno clienteExterno = new ClienteExterno();

	@Inject
	private ClienteExternoService clienteService;

	public void inicio() {
		if (id != null) {
			clienteExterno = clienteService.porId(id);
		}
	}

	public void salvar() {
		clienteService.salvar(clienteExterno);
	}

	public void excluir() {
		clienteService.excluir(clienteExterno);
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setClienteExterno(ClienteExterno clienteExterno) {
		this.clienteExterno = clienteExterno;
	}

	public ClienteExternoService getClienteService() {
		return clienteService;
	}

	public ClienteExterno getClienteExterno() {
		return clienteExterno;
	}

	public void setClienteService(ClienteExternoService clienteService) {
		this.clienteService = clienteService;
	}

}