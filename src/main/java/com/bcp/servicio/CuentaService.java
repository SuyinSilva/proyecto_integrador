package com.bcp.servicio;

import java.util.List;
import com.bcp.entidad.Cliente;
import com.bcp.entidad.Cuenta;


public interface CuentaService {

	public abstract List<Cuenta>  listaCuentaPorCliente(int idCliente);
	public abstract Cuenta listaCuentaPorNumero(String numero);
	public abstract List<Cliente> listarPorNombre(String cuentaDes);
	public abstract Cuenta acCuenta(Cuenta obj);
	public abstract Cuenta acCuenta1(Cuenta obj);
	
	public abstract Cuenta actualizaSaldo(Cuenta obj);
	/*double saldo,String numero*/
	

}
