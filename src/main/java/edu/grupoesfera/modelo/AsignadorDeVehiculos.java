package edu.grupoesfera.modelo;

import java.util.List;

public class AsignadorDeVehiculos {

	public AsignadorDeVehiculos() {
	}
	
	public Envio asignar(List<String> paquetes) {
		Envio envio = new Envio();
		
		if(paquetes.size() <5) {
			envio.setVehiculo("BICICLETA");
		}else if(paquetes.size() <10) {
			envio.setVehiculo("MOTO");
		}else if(paquetes.size() <30) {
			envio.setVehiculo("AUTO");
		}
		
		return envio;
	}

}
