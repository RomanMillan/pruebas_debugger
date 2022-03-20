package boletin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ED1T2P {

	public static void main(String[] args) throws IOException {
	
		int numero;
		double resultado;
		
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Dame un número: ");
		numero = Integer.parseInt(lectura.readLine());
		resultado = funcionMagica(numero); //◄ Puesto el breakPoint
		System.out.println("El resultado obenido es "+ resultado);
	}

	public static double funcionMagica(int a) {
		double r;
		r = a/((((((a*2.0)*5.0)*3.0)/2.0)/5.0)/3.0); //el -a es quitado para que funcione bien
		return r;
	}
}

/*
 * El breakpoint lo he puesto en el momento donde es llamado la funcion funcionMagica
 * par ver el funcionamiento real de la funcion.
 * Despues he inspeccionado el resultado de a/(((((((a*2.0)*5.0)*3.0)/2.0)/5.0)/3.0)-a)
 * y da infinity.
 * Despues he inspeccionado cada formula el resultado que da.
 * y cuadno llega a la resta -a tiene un valor de 4 y -a (4) lo deja en 0
 * y desupés hace la division 0/0 dando el error de infinity
 * 
 * la solucion es quitar la resta final de -a para que pueda hacer la division correcta.
 */
