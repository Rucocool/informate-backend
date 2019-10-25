package com.et.informate.backend.informatebackend.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.et.informate.backend.informatebackend.app.servicio.IServicioInformate;
import com.et.informate.backend.informatebackend.app.servicio.respuesta.ResEjemplo;
import com.et.informate.backend.informatebackend.app.servicio.solicitud.SolEjemplo;

@RestController
@RequestMapping("/api")
public class PrincipalController {
	
	private static final Logger logger = LoggerFactory
			.getLogger(PrincipalController.class);
	
	@Autowired
	IServicioInformate informateServicio;
	
	
	@RequestMapping(
    		value = "/informate/ejemplo", 
    		method = RequestMethod.POST, 
    		headers = "Accept=application/json")
    public ResEjemplo registroAcceso(
    		@RequestBody SolEjemplo solicitud) {
    	logger.info(" /informate/ejemplo  || INGRESO  ");
    	
    	logger.info("■■■ /informate/ejemplo  || SOLICITUD ■■■ " 
    			+ solicitud.toString());
    	    	
    	ResEjemplo resultado = informateServicio.metodoEjemplo(solicitud);
    	
    	logger.info(" /registro/ejemplo  || SALIO  ");
    	
        return resultado;
    }

}
