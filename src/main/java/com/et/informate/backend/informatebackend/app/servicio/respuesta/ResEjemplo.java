package com.et.informate.backend.informatebackend.app.servicio.respuesta;

import java.util.List;

import com.et.informate.backend.informatebackend.app.servicio.dto.DepartamentoDto;
import com.et.informate.backend.informatebackend.app.servicio.utiles.UtilResultadoBase;

public class ResEjemplo extends UtilResultadoBase {

	List<DepartamentoDto> listaDepertamentos;

	public ResEjemplo() {
	}

	public ResEjemplo(List<DepartamentoDto> listaDepertamentos) {
		this.listaDepertamentos = listaDepertamentos;
	}

	public List<DepartamentoDto> getListaDepertamentos() {
		return listaDepertamentos;
	}

	public void setListaDepertamentos(List<DepartamentoDto> listaDepertamentos) {
		this.listaDepertamentos = listaDepertamentos;
	}

	@Override
	public String toString() {
		return "ResEjemplo [listaDepertamentos=" + listaDepertamentos + "]";
	}

}
