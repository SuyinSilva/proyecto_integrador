package com.bcp.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entidad.ConfiguracionNotificacion;
import com.bcp.entidad.Tarjeta;
import com.bcp.repositorio.ConfiRepository;
import com.bcp.repositorio.TarjetaRepository;
@Service
public class ConfServiceImpl implements ConfService{
	@Autowired
	private ConfiRepository repository;

	@Override
	public ConfiguracionNotificacion traerConfiguracionNotificacion(int filtro) {
		
		return null;
	}

	@Override
	public List<ConfiguracionNotificacion> traerConfiguracionNotificaciondeCliente(String idTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizaestadoActivo(String idTarjeta) {
		repository.actualizaestadoActivo(idTarjeta);
		
	}

	@Override
	public void actualizaestadoInactivo(String idTarjeta) {
		repository.actualizaestadoInactivo(idTarjeta);
		
	}




	









}
