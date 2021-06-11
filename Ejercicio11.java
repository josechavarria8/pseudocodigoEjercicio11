
import java.util.Random;
import java.io.*;

public class Ejercicio11 {

	public static void main(String args[]) {
		
		Random random = new Random();

		double i;
		int impares=0;
		int nmayor=0;
		int num13_24=0;
		int numal=0;
		int pares=0;
		double prompar=0;
		int sumapar=0;
		for (i=1;i<=10;i++) {
			numal = random.nextInt(36);
			if (numal%2==0) {
				if (numal!=0) {
					pares = pares+1;
					sumapar = sumapar+numal;
				}
			} else {
				impares = impares+1;
			}
			if (numal>=13 && numal<=24) {
				num13_24 = num13_24+1;
			}
			if (numal>nmayor) {
				nmayor = numal;
			}
			System.out.println(numal);
		}
		prompar = sumapar/pares;
		System.out.println("Cantidad de Impares: "+impares);
		System.out.println("Promedio de Pares:"+prompar);
		System.out.println("Cantidad de numeros en segunda docena: "+num13_24);
		System.out.println("Numero mayor: "+nmayor);
	}


}

