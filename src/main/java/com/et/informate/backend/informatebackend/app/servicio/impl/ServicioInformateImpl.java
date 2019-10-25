package com.et.informate.backend.informatebackend.app.servicio.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.et.informate.backend.informatebackend.app.dao.DepartamentoDao;
import com.et.informate.backend.informatebackend.app.dominio.Departamento;
import com.et.informate.backend.informatebackend.app.servicio.IServicioInformate;
import com.et.informate.backend.informatebackend.app.servicio.dto.DepartamentoDto;
import com.et.informate.backend.informatebackend.app.servicio.respuesta.ResEjemplo;
import com.et.informate.backend.informatebackend.app.servicio.solicitud.SolEjemplo;
import com.et.informate.backend.informatebackend.app.servicio.utiles.UtilMensaje;
import com.et.informate.backend.informatebackend.app.servicio.utiles.UtilTipoMensaje;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@Transactional
public class ServicioInformateImpl implements IServicioInformate{
	
	private final static Logger logger = LoggerFactory.getLogger(ServicioInformateImpl.class);	
	
	@Autowired
	DepartamentoDao departamentoDao;
		

	@Override
	public ResEjemplo metodoEjemplo(SolEjemplo solicitud) {
		logger.info("░▒▓███▀▀ INGRESA || metodoEjemplo ▀▀███▓▒░ ");		
		ResEjemplo respuesta = new ResEjemplo();
	
		try {			
			logger.info("■■■ SOLICITUD ■■■ " + solicitud  );
			
			//	TODO realizar tarea de ejemplo 
			
			List<DepartamentoDto> listaDepartamentos = new ArrayList<>();
			
			for (Departamento departamento : departamentoDao.findAll()) {
				DepartamentoDto departamentoDto = new DepartamentoDto();
				departamentoDto.setNombreDepartamento(
						departamento.getNomDep());
				departamentoDto.setNumeroDepartamento(
						departamento.getNumDep());
				
				listaDepartamentos.add(departamentoDto);
				
			}
			
			respuesta.setListaDepertamentos(listaDepartamentos);
			
			respuesta.getMensajes().add(new UtilMensaje(
					"Se Realizo La Consulta Correctamente", 
					"Se Realizo La Consulta Correctamente",
					UtilTipoMensaje.INFORMATIVO));
			respuesta.setOk(true);

		} catch (Exception e) {
			logger.info("■■■ Error, No se Realizo La Consulta ■■■ " + e );
			respuesta.getMensajes()
					.add(new UtilMensaje("No se Realizo La Consulta", 
							e.getMessage().toString(), 
							UtilTipoMensaje.ERROR));
			respuesta.setOk(false);
		}
		logger.info("░▒▓███▄▄ SALIR || metodoEjemplo ▄▄███▓▒░ ");
		
		return respuesta;
	}

}
