package org.casadocodigo.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.casadocodigo.Pessoa;

public class PessoaDAO {
	
	@PersistenceContext
	private EntityManager entity;
	
	public void save(Pessoa pessoa) {
		entity.persist(pessoa);
	}
	

}
