package ar.edu.unlam.interfaz;

import ar.edu.unlam.dominio.Persona;

public class EjemploDeVida {

	public static void main(String[] args) {
		//creamos la persona sofia
		//por parametros le pasamos los datos que tiene que tener
		//como si fuese una libreta
		Persona sofia = new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50); 
		
		System.out.println(sofia);
		//lo que se observa al imprimir la variable sofia
		//es que nos muestra la posicion del objeto.
		
		System.out.println("\nSofia pesa: " +sofia.pesar());
		System.out.println("Sofia mide: " +sofia.medir());
		System.out.println("Edad de sofia: " +sofia.decirAnios());
		
		//DATOS DE SOFIA ANTES DE ACTUALIZARLOS
		
		sofia.alimentar(1.0);
		sofia.crecer(0.5);
		sofia.cumplirAnos();
		//aca se utilizan los datos que se explicaron en la clase PERSONA
		//para aplicar los metodos se utiliza lo siguiente
		// el nombre del objeto + el nombre del metodo, ej: sofia.alimentar(1.0);
		
		
		System.out.println("\nPeso de sofia actualizado: " +sofia.pesar());
		System.out.println("Altura de sofia actualizada: " +sofia.medir());
		System.out.println("Edad de sofia actualizada: " +sofia.decirAnios());
		
		//DATOS DE SOFIA ACTUALIZADOS
		
	}

}
