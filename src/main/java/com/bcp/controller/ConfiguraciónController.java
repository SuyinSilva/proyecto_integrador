package com.bcp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bcp.entidad.Cliente;
import com.bcp.entidad.ConfiguracionNotificacion;
import com.bcp.entidad.Tarjeta;
import com.bcp.servicio.ConfService;
import com.bcp.servicio.HistorialCuentaService;
import com.bcp.servicio.TarjetaService;

@Controller
public class ConfiguraciónController {
	@Autowired
	private HistorialCuentaService historialCuentaService;
	@Autowired
	private ConfService confService;
	@Autowired
	private TarjetaService tarjetaService;

	
	/*@RequestMapping("/verConfiguracion")
	public String ver() {
		return "configuración";
	}*/


	@RequestMapping("/salidaConfiguracion")
	public String regConfiguracion() {
		return "configuración";
	}
	
/*	@RequestMapping("/configuracionNotificacion")
	public String configuracionNotificacion(HttpSession session) {
		ConfiguracionNotificacion objCon = (ConfiguracionNotificacion)	session.getAttribute("objCon");
		Tarjeta objTarjeta = (Tarjeta)	session.getAttribute("objTarjeta");
		if(objCon.getEstado()==1) {
			confService.actualizaestadoInactivo(objTarjeta.getIdTarjeta());
			session.setAttribute("MENSAJE", "Notificacion Inactiva");
		}
		else {
			confService.actualizaestadoActivo(objTarjeta.getIdTarjeta());
			session.setAttribute("MENSAJE", "Notificacion Activa");
		}
		return "configuración";
	}
	*/
	@RequestMapping("/configuracionTarjeta")
	public String configuracionTarjeta(Tarjeta x,HttpSession session) {
		Tarjeta objTarjeta = (Tarjeta)	session.getAttribute("objTarjeta");
		Cliente objCLiente= 	(Cliente)	session.getAttribute("objCliente");
		if(objTarjeta.getIdestado()==1) {
			tarjetaService.actualizaestadoInactivo(objCLiente.getIdCliente());
			session.setAttribute("MENSAJE", "Tarjeta Inactiva");
		}
		else {
			tarjetaService.actualizaestadoActivo(objCLiente.getIdCliente());
			session.setAttribute("MENSAJE", "Tarjeta Activa");
		}
		return "configuracionTarjeta";
	}
	

}
