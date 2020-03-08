package com.original.clientes.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "CUSTOMER")
@SequenceGenerator(name = "seq_tbl_customer", sequenceName = "seq_tbl_customer", allocationSize = 1)
public class CustomerAPI {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_customer")
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
