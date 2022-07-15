package com.example.demo;

public class ArchivoJSON {
	private String nombre;
	private String tipo;
	private Integer peso;
	
	public ArchivoJSON (String nombre, String tipo, Integer peso) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}
}
