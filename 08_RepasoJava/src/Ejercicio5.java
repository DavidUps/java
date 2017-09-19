
public class Ejercicio5 {

	public static void main(String[] args) {
		/* A partir del mismo array de enteros, recorrerlo y mostrar por pantalla true si encuentra, al menos, el nº 1 y false si no encuentra ningún nº 1.
		Intenta optimizar el algoritmo para que, una vez encuentre el nº 1, deje de seguir buscando... */
		
		int[] a = {4,5,6,3,2,3,4,5,6,1,2,3,4,5};
		
		boolean n = false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==1) {
				n = true;
				System.out.println(n);
			}
		}
		
		if(n == false)
			System.out.println("no se ha encontrado ningun 1");
	}

}
