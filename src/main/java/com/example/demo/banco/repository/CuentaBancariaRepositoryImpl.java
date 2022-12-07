package com.example.demo.banco.repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	
	
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// SELECT * FROM CUENTA C WHERE C.NUMERO = numeroCuenta, esto debería h sin Mock
		// abajo de todo el obj cuenta .
		
		CuentaBancaria cuenta = null;

		for(CuentaBancaria cb: baseCuentas) {  			// Para cada elemento en baseCuentas, hacer:
			if(cb.getNumero().equals(numeroCuenta)) {   // Si ese elemento es igual al número de cuenta pasado, cuenta se inicializa con el elemento.
				cuenta = cb;
			}
		}	
		return cuenta;
	}

	
	//C R U D implementado:
	@Override
	public CuentaBancaria buscar(Integer id) {
			System.out.println("Se busca la cuenta "+id);
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {		
		
		CuentaBancaria cuenta = null;

		for(CuentaBancaria cb: baseCuentas) {  						  // Para cada elemento en baseCuentas, hacer:
			if(cb.getNumero().equals(cuentaBancaria.getNumero())) {   // Si ese elemento es igual al número de cuenta pasado, cuenta se inicializa con el elemento.
				//baseCuentas.add(cuentaBancaria);
				cuenta = cb;
			}
		}	
		baseCuentas.remove(cuenta);
		baseCuentas.add(cuentaBancaria);
		System.out.println("Se actualiza la cuenta "+cuentaBancaria);
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		System.out.println("Se inserta la cuenta bancaria"+ cuentaBancaria);
		baseCuentas.add(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		System.out.println("Se borra la cuenta "+id);
	}

}




//CuentaBancaria cuenta = new CuentaBancaria();
//cuenta.setNumero(numeroCuenta);
//cuenta.setSaldo(new BigDecimal(100));
//cuenta.setTipo("A");
//cuenta.setTitular("Edison Cayambe");
