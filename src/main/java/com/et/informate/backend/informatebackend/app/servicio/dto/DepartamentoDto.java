package com.et.informate.backend.informatebackend.app.servicio.dto;

public class DepartamentoDto {

	int numeroDepartamento;
	String nombreDepartamento;

	public DepartamentoDto() {
	}

	public DepartamentoDto(int numeroDepartamento, String nombreDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
		this.nombreDepartamento = nombreDepartamento;
	}

	public int getNumeroDepartamento() {
		return numeroDepartamento;
	}

	public void setNumeroDepartamento(int numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return "DepartamentoDto ["
				+ "numeroDepartamento=" + numeroDepartamento 
				+ ", nombreDepartamento=" + nombreDepartamento 
				+ "]";
	}

}
