package com.generation.FarmaciaBackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@Size(min = 5, max = 30, message = "O atributo nome deve conter no mínimo 05 e no máximo 30 caracteres")
	private String nome;
	
	@Size(min = 1, max = 15, message = "O atributo tarja deve conter no mínimo 1 e no máximo 15 caracteres")
	private String tarja;
	
	@Size(min = 0, message = "O preço deve ser maior que zero")
	private Float preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}
	
}