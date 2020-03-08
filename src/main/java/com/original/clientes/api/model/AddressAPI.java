package com.original.clientes.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotEmpty;


@Entity(name = "ADDRESS")
@SequenceGenerator(name = "seq_tbl_address", sequenceName = "seq_tbl_address", allocationSize = 1)
public class AddressAPI {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tbl_address")
	@Column(name = "ID")
	private Long id;
	
    private Long idCustomer;

	@Column(nullable = false)
	@NotEmpty
	private String cep;

	@Column(nullable = false)
	@NotEmpty
	private String rua;
	
	@Column(nullable = false)
	@NotEmpty
	private String bairro;
	
	@Column(nullable = false)
	@NotEmpty
	private String cidade;
	
	@Column(nullable = false)
	@NotEmpty
	private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomer() {
		return idCustomer;
	}

	public void setCustomer(Long customer) {
		this.idCustomer = customer;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
