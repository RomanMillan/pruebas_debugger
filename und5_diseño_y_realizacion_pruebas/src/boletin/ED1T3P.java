package boletin;

public class ED1T3P {

	public static void main(String[] args) {
		int i;
		i = 0;
		while(i<100) {
			if(i%2==0) {
				System.out.println("Par");
			}else {
				System.out.println("Impar");
			}
			i++;  
			// Se elimina las anteriores variables, y se pone una al final que sume
			// independientemente de si es par o impar.
		}
	}

}

/*
 * El bucle es infinito ya que cada operacion que realiza está sumando o restando 
 * en la variable i que es con la cuál se decide cuando salir del bucle.
 * Una vez que la variable i llegue a 100 sale del bucle, pero esto nunca va a ocurrir 
 * ya que se suma y cuadno llega a un numero impar se le resta un numero con lo que está
 * constantemente dando vueltas.
 * 
 * La solución: Es eliminar las dos variables i tanto la resta como la suma 
 * y poner una i++ en despues del if.
 */