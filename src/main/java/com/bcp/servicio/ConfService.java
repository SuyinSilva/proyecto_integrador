package com.bcp.servicio;
import java.util.List;
import com.bcp.entidad.ConfiguracionNotificacion;

public interface ConfService {
	public abstract ConfiguracionNotificacion traerConfiguracionNotificacion(int filtro);
	public abstract List<ConfiguracionNotificacion> traerConfiguracionNotificaciondeCliente(String idTarjeta);
	public abstract void actualizaestadoActivo(String idTarjeta );
	public abstract void actualizaestadoInactivo(String idTarjeta);
}
