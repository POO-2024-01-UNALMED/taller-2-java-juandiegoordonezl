package test;

public class Auto {
	String modelo;
	int precio;
    Asiento[] asientos ;
	String marca;
	Motor motor;
	int registro;
	int acientos;
	static int cantidadCreados;
  	
	 	int cantidadAsientos() { 
		for(int i=0;i< asientos.length;i++) {
			if (asientos[i]!= null) {	
				acientos+=1;
			}
    		  		
		}
		return acientos;
	}
	
	 	String verificarIntegridad(){
		String aviso="Auto original";
		if (this.registro== motor.registro ) {
			for(int i=0;i< asientos.length;i++) {
				if (asientos[i]!= null) {	
				 if(asientos[i].registro!=this.registro) {
					 aviso="Las piezas no son originales";
					 break;
				 }
				}
				
		}
		}
		else {
			 aviso="Las piezas no son originales";
		}
		return aviso;	
	}
	
}
