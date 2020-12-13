package com.bcp.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bcp.entidad.ConfiguracionNotificacion;
import com.bcp.entidad.Tarjeta;


public interface ConfiRepository extends JpaRepository<ConfiguracionNotificacion, Integer>{

	@Transactional
	@Modifying
	@Query("update ConfiguracionNotificacion x set  x.estado =  1 where x.tarjeta.idTarjeta =:var_idTarjeta")
	public abstract void actualizaestadoActivo(@Param("var_idTarjeta")String idTarjeta);
	
	@Transactional
	@Modifying
	@Query("update ConfiguracionNotificacion x set  x.estado =  2 where x.tarjeta.idTarjeta =:var_idTarjeta")
	public abstract void actualizaestadoInactivo(@Param("var_idTarjeta")String idTarjeta);


}
