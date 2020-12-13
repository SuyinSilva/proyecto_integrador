package com.bcp.entidad;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EstadoHasConfiPK implements Serializable {
private static final long serialVersionUID = 1L;
	
	private int idestado; 
	private int idconfi;
	
	public int getIdestado() {
		return idestado;
	}
	public void setIdestado(int idestado) {
		this.idestado = idestado;
	}
	public int getIdconfi() {
		return idconfi;
	}
	public void setIdconfi(int idconfi) {
		this.idconfi = idconfi;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	
	
}
