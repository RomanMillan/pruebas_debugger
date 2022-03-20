package boletin;

import java.util.Random;

public class ED1T1P {

	static Random rnd=new Random();
	public static void main(String[] args) {
		int veces;
		int contador=0;
		
		veces = rnd.nextInt(100)+1;

		for(int i = 0;i<veces;i++) { //he puesto el breakpoint aquí para ver la reaccion del bucle
			contador = 0; //◄ Esta variable tiene que quitarse para que funcione correctamente
			System.out.println(rnd.nextInt(50));
			contador++;
		}
		System.out.println("Se han generado "+ contador +"números aleatorios");
	}

}

/*
 * El problema está dentro del bucle for en la variable contador que está situada 
 * dentro del bucle, donde además tiene asignado un cero,con lo que cada vez que el 
 * bucle de una vuelta el contador se resetea a 0.
 * 
 *  La solución es quitar la variable del blucle.
 * */