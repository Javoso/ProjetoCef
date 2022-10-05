package br.com.CEF.Teste;

import br.com.CEF.Dao.ClienteExternoDao;
import br.com.CEF.Model.ClienteExterno;
import br.com.CEF.Model.Endereco;
import br.com.CEF.Service.ClienteExternoService;

public class Teste {

	public static void main(String[] args) {

		ClienteExterno cliente2 = new ClienteExterno();
		ClienteExternoService service = new ClienteExternoService();

		cliente2.setNome("Lucas O Javoso");
		cliente2.setCPF("123.456.777-00");
		cliente2.setDescricaoAlergica("Tenho Não");

		Endereco endereco = new Endereco();

		endereco.setRua("Rua são mateus");
		endereco.setCep("63908210");
		endereco.setBairro("Alto são Francisco");
		endereco.setCidade("Quixadá");
		endereco.setEstado("Ceára");
		endereco.setNumeroCasa("162-A");

		endereco.setClienteExterno(cliente2);
		cliente2.getEndereco().add(endereco);

		service.salvar(cliente2);
		//
		// Fornecedor fornecedor = new Fornecedor();
		// Medicamento m = new Medicamento();
		// Categoria categoriaPai = new Categoria();
		//
		// categoriaPai.setDescricao("Bebidas");
		// Categoria categoriaFilha = new Categoria();
		// categoriaFilha.setDescricao("Refrigerantes");
		// categoriaFilha.setCategoriaPai(categoriaPai);
		// categoriaPai.getSubcategorias().add(categoriaFilha);
		//
		// m.setCategoria(categoriaFilha);
		// m.setDataCompra(new Date());
		// m.setLote("3453451235rdf345");
		// m.setMarca("Generico");
		// m.setNome("dipiroma");
		// m.setPrecoCompra(1.50);
		// m.setPrecoVenda(2.00);
		// m.setSku("XA2233");
		// m.setQuantidade(12);
		// m.setFornecedor(fornecedor);
		// m.setValidade(new Date());
		//
		// fornecedor.setCnpj("1231234515");
		// fornecedor.setNome("Lucas");
		// fornecedor.setNomeFantasia("Javoso");
		// endereco.setFornecedor(fornecedor);
		// fornecedor.getMedicamento().add(m);
		// fornecedor.getEndereco().add(endereco);
		//
		//
		// EnderecoEntrega enderecoEntrega = new EnderecoEntrega();
		// enderecoEntrega.setLogradouro("Rua Amarela");
		// enderecoEntrega.setNumero("1000");
		// enderecoEntrega.setCidade("Quixadá");
		// enderecoEntrega.setUf("CE");
		// enderecoEntrega.setCep("23145-434");
		//
		// ClienteExterno cliente;
		// Medicamento produto;
		// Usuario vendedor;
		//
		// Pedido pedido = new Pedido();
		// pedido.setClienteExterno(cliente);
		// pedido.setDataCriacao(new Date());
		// pedido.setDataEntrega(new Date());
		// pedido.setFormaPagamento(FormaPagamento.CARTAO_CREDITO);
		// pedido.setObservacao("Aberto das 08 às 18h");
		// pedido.setStatus(StatusPedido.ORCAMENTO);
		// pedido.setValorDesconto(BigDecimal.ZERO);
		// pedido.setValorFrete(BigDecimal.ZERO);
		// pedido.setValorTotal(new BigDecimal(23.2));
		// pedido.setVendedor(vendedor);
		// pedido.setEnderecoEntrega(enderecoEntrega);
		//
		// ItemPedido item = new ItemPedido();
		// item.setMedicamento(produto);
		// item.setQuantidade(10);
		// item.setValorUnitario(new BigDecimal(2.32));
		// item.setPedido(pedido);
		//
		// pedido.getItens().add(item);
		//
		// Usuario usuario = new Usuario();
		// usuario.setNome("Maria");
		// usuario.setEmail("maria@abadia.com");
		// usuario.setSenha("123");
		//
		// Grupo grupo = new Grupo();
		// grupo.setNome("Vendedores");
		// grupo.setDescricao("Vendedores da empresa");
		//
		// usuario.getGrupos().add(grupo);
		//
		// manager.persist(usuario);

		//
		// manager.persist(categoriaPai);
		// manager.persist(fornecedor);
		//
		// transaction.commit();

	}

}
