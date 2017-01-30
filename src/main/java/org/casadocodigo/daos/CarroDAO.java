package org.casadocodigo.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.casadocodigo.Carro;

public class CarroDAO {
	
	@PersistenceContext
	private EntityManager entity;
	
	@SuppressWarnings("unchecked")
	public List<Carro> listar() {
		
		List<Carro> carros = new ArrayList<>();
		Query q = entity.createQuery("FROM Carro");
		carros = q.getResultList();
		
		return carros;
		
	}

}
