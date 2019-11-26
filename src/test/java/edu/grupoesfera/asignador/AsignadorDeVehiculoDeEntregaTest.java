package edu.grupoesfera.asignador;


import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import edu.grupoesfera.modelo.*;

public class AsignadorDeVehiculoDeEntregaTest {

	
	
	@Test(expected = RuntimeException.class)
	public void mas30Paquetes() {
		List<String> paquetes = new LinkedList<>();
		
		for (int i = 0; i <47; i++) {
			paquetes.add("libro");
		}
		
		AsignadorDeVehiculos asignador = new AsignadorDeVehiculos();
		Envio envio = asignador.asignar(paquetes);
	}
	
	@Test
	public void masDiezPaquetesAuto() {
		List<String> paquetes = new LinkedList<>();
		
		for (int i = 0; i <20; i++) {
			paquetes.add("libro");
		}
		
		AsignadorDeVehiculos asignador = new AsignadorDeVehiculos();
		Envio envio = asignador.asignar(paquetes);
		assertThat(envio.getVehiculo()).isEqualTo("AUTO");
	}
	
	@Test
	public void entreCincoDiezPaquetesMoto() {
		List<String> paquetes = new LinkedList<>();
		
		for (int i = 0; i <7; i++) {
			paquetes.add("libro");
		}
		
		AsignadorDeVehiculos asignador = new AsignadorDeVehiculos();
		Envio envio = asignador.asignar(paquetes);
		assertThat(envio.getVehiculo()).isEqualTo("MOTO");
	}
	
	@Test
	public void menosDeCincoPaquetesBicicleta() {
		//preparacion
		List<String> paquetes = new LinkedList<>();
		paquetes.add("libro");
		paquetes.add("libro");
		AsignadorDeVehiculos asignador = new AsignadorDeVehiculos();
		
		//ejecucion
		Envio envio = asignador.asignar(paquetes);
		
		//validacion
		assertThat(envio.getVehiculo()).isEqualTo("BICICLETA");
	}
}

