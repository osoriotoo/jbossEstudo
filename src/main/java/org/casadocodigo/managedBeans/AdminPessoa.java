package org.casadocodigo.managedBeans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.casadocodigo.Carro;
import org.casadocodigo.Pessoa;
import org.casadocodigo.daos.CarroDAO;
import org.casadocodigo.daos.PessoaDAO;

@Model
public class AdminPessoa {
	
	private Pessoa pessoa = new Pessoa();
	
	private List<Integer> carrosSelecionados = new ArrayList<>();
	
	private List<Carro> listaCarros;
	
	@Inject
	private PessoaDAO pessoaDAO;
	
	@Inject
	private CarroDAO carroDAO;
	
	@Transactional
	public void save() {
		pessoaDAO.save(pessoa);
	}
	
	@PostConstruct
	private void popularListaCarros() {
		listaCarros = carroDAO.listar();
		}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Integer> getCarrosSelecionados() {
		return carrosSelecionados;
	}

	public void setCarrosSelecionados(List<Integer> carrosSelecionados) {
		this.carrosSelecionados = carrosSelecionados;
	}

	public List<Carro> getListaCarros() {
		return listaCarros;
	}

	public void setListaCarros(List<Carro> listaCarros) {
		this.listaCarros = listaCarros;
	}

}
