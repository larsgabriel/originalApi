package com.original.clientes.api.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.original.clientes.api.model.AddressAPI;
import com.original.clientes.api.model.CustomerAPI;
import com.original.clientes.api.repository.CustomerApiRepository;

@Service
public class CustomerAPIService {

	@PersistenceContext
	EntityManager em;

	@Autowired
	CustomerApiRepository repository;

	RestTemplate restTemplate = new RestTemplate();

	public CustomerAPI saveCustomer(CustomerAPI customer) {
		return repository.save(customer);
	}
	
	public AddressAPI saveAddress(AddressAPI address) {
		return repository.save(address);
	}
	
	public List<CustomerAPI> searchById(Long id) {

		CriteriaBuilder qb = em.getCriteriaBuilder();
		CriteriaQuery<CustomerAPI> cq = qb.createQuery(CustomerAPI.class);
		Root<CustomerAPI> customer = cq.from(CustomerAPI.class);
		List<Predicate> predicates = new ArrayList<Predicate>();
		List<CustomerAPI> pedidos;
		predicates.add(qb.greaterThan(customer.get("id"), id));

		cq.select(customer).where(predicates.toArray(new Predicate[] {}));
		pedidos = em.createQuery(cq).getResultList();

		return pedidos;
	}

	public List<CustomerAPI> findAll() {
 		return repository.findAll();
	}

	public List<CustomerAPI> delete(CustomerAPI customer) {
		repository.delete(customer);
		return null;
	}

}
