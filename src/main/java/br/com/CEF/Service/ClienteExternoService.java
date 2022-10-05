package br.com.CEF.Service;

import java.util.List;

import javax.inject.Inject;

import br.com.CEF.Dao.ClienteExternoDao;
import br.com.CEF.Model.ClienteExterno;
import br.com.CEF.util.jpa.Transacional;

public class ClienteExternoService {

	@Inject
	private ClienteExternoDao dao;

	@Transacional
	public void salvar(ClienteExterno clienteExterno) {
		dao.salvar(clienteExterno);
	}

	@Transacional
	public void excluir(ClienteExterno clienteExterno) {
		dao.remover(clienteExterno);
	}

	public List<ClienteExterno> listAll() {
		return dao.listAll();
	}

	public ClienteExterno porId(Long id) {
		return dao.porId(id);
	}
}
