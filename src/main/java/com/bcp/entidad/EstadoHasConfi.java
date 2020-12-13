package com.bcp.entidad;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "estado_has_conf")
public class EstadoHasConfi {

	@EmbeddedId
	private EstadoHasConfiPK estadoHasConfiPK;

	@ManyToOne
	@JoinColumn(name = "idestado", nullable = false, insertable = false, updatable = false)
	private EstadoNotificacion estado;

	@ManyToOne
	@JoinColumn(name = "idconfi", nullable = false, insertable = false, updatable = false)
	private ConfiguracionNotificacion configuracionNotificacion;

	public EstadoHasConfiPK getEstadoHasConfiPK() {
		return estadoHasConfiPK;
	}

	public void setEstadoHasConfiPK(EstadoHasConfiPK estadoHasConfiPK) {
		this.estadoHasConfiPK = estadoHasConfiPK;
	}

	
	public EstadoNotificacion getEstado() {
		return estado;
	}

	public void setEstado(EstadoNotificacion estado) {
		this.estado = estado;
	}

	public ConfiguracionNotificacion getConfiguracionNotificacion() {
		return configuracionNotificacion;
	}

	public void setConfiguracionNotificacion(ConfiguracionNotificacion configuracionNotificacion) {
		this.configuracionNotificacion = configuracionNotificacion;
	}

	

	
	
}
