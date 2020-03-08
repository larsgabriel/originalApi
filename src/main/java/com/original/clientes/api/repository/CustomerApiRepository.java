package com.original.clientes.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.original.clientes.api.model.AddressAPI;
import com.original.clientes.api.model.CustomerAPI;

@Repository
public interface CustomerApiRepository extends CrudRepository<CustomerAPI, Long> {

	Optional<CustomerAPI> findById(Long id);
	void deleteById (Long id);
	List< CustomerAPI > findAll();
	AddressAPI save(AddressAPI address);


}
