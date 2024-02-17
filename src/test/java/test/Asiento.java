package test;

public class Asiento {
     String color;
     int precio;
     int registro;
     
      void cambiarColor(String x) {
    	 String[] colores= {"rojo","verde","amarillo","negro","blanco"};
    	 
    	 for (int i=0;i<5;i++) {
    		 if (colores[i]==x) {
    		    this.color=x;
        }
      }
   }
}
