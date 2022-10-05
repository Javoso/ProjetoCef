package br.com.CEF.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class PesquisaMedicamentosBean {
	
	private List<Integer> medicamentosFiltrados;
	
	public PesquisaMedicamentosBean() {
		medicamentosFiltrados = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			medicamentosFiltrados.add(i);
		}
	}
	
	public List<Integer> getMedicamentosFiltrados(){
		return medicamentosFiltrados;
	}
}
