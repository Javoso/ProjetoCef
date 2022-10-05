package br.com.CEF.Dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.CEF.Model.ClienteExterno;
import br.com.CEF.Service.Exception.NegocioException;

public class ClienteExternoDao {

	@Inject
	private EntityManager manager;

	public ClienteExterno salvar(ClienteExterno clienteExterno) {
		return manager.merge(clienteExterno);
	}

	public ClienteExterno porId(Long id) {
		return manager.find(ClienteExterno.class, id);
	}

	public void remover(ClienteExterno clienteExterno) {
		try {
			clienteExterno = porId(clienteExterno.getId());
			manager.remove(clienteExterno);
			manager.flush();
		} catch (Exception e) {
			throw new NegocioException("Cliente não pode ser excluido " + e.getMessage());
		}
	}
	public List<ClienteExterno> listAll() {
		return manager.createNamedQuery("select * from ClienteExterno", ClienteExterno.class).getResultList();
	}
}
