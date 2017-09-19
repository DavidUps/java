
public class Ejercicio4 {

	public static void main(String[] args) {
		// A partir de un array de enteros, recorrerlo y obtener por pantalla la cantidad total de números pares
		
		int[] a = {4,5,6,3,2,3,4,5,6,1,2,3,4,5};
		
		int resul=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				resul= a[i]+resul;
			}
		}
		
		System.out.println("Total de números pares: "+resul);
	}

}
