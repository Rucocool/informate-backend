package com.et.informate.backend.informatebackend.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class InicioController {
		
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public String resultadoVerificacion() {
		return "Resultado de verificacion del PROYECTO - INFORMA ";
	}

}
