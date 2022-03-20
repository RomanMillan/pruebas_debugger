package boletin;

import java.util.Random;

public class ED1T4P {

	static Random rnd=new Random();
	public static void main(String[] args) {
		int iterador = 0;
		while(iterador>=0) { // < poner breakPoint
			iterador = aumentar(iterador);
			iterador = disminuir(iterador);
		}

	}
	
	public static int aumentar(int a) {
		int aumento = rnd.nextInt(10); //< el problema es 50 yo pondría 10
		System.out.println("Aumentando "+aumento);
		return (a+aumento);
	}
	
	public static int disminuir(int a) {
		int disminucion = rnd.nextInt(10);
		System.out.println("Disminuyendo "+disminucion);
		return (a-disminucion);
	}

}

/*
 * EL problema es que tiene un rango de 50 en el metodo sumando y el de disminuir solo 10
 * esto genera una situacion de practicamente bucle infinito ya que es una probavilidad muy 
 * alta la de sumar siempre más de la que resta.
 * 
 * Solución: poner el rango de aumento en 10. para igualar la probavilidad tanto de sumar 
 * como la de restar.
 * */
 