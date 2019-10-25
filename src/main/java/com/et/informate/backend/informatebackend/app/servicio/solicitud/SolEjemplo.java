package com.et.informate.backend.informatebackend.app.servicio.solicitud;

public class SolEjemplo {

	int idPrueba;

	public SolEjemplo() {
	}

	public SolEjemplo(int idPrueba) {
		this.idPrueba = idPrueba;
	}

	public int getIdPrueba() {
		return idPrueba;
	}

	public void setIdPrueba(int idPrueba) {
		this.idPrueba = idPrueba;
	}

	@Override
	public String toString() {
		return "SolEjemplo [idPrueba=" + idPrueba + "]";
	}

}
