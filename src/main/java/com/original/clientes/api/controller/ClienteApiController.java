package com.original.clientes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.original.clientes.api.model.AddressAPI;
import com.original.clientes.api.model.CustomerAPI;
import com.original.clientes.api.service.CustomerAPIService;

@RestController
@RequestMapping("/original-api")
public class ClienteApiController {
	
	@Autowired
	private CustomerAPIService customerApiService;
		
	@GetMapping(value ="/searchById/{id}")
	public List<CustomerAPI> searchById(@PathVariable Long id ) {
		List<CustomerAPI> pedidos = customerApiService.searchById(id);
		return pedidos;
	}
	
	@PostMapping(value ="/addCustomer")
	public CustomerAPI addCustomer(@RequestBody CustomerAPI customer ) {
		return customerApiService.saveCustomer(customer);
	}
	
	@PostMapping(value ="/addAdress")
	public AddressAPI addAdress(@RequestBody AddressAPI address ) {
		return customerApiService.saveAddress(address);
	}
	
	@GetMapping(value ="/findAll")
	public List<CustomerAPI> findAll() {
		return  customerApiService.findAll();
	}
	@DeleteMapping(value ="/deleteCustomer")
	public List<CustomerAPI> delete(CustomerAPI customer) {
		return  customerApiService.delete(customer);
	}
	
	
}
