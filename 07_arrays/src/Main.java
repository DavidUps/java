import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
		// ARRAYS ESTATICOS
		String [] nombre = {"hola","hello","bonjour","chao","czesc"};
		
		//ARRAYS DINAMICOS: ARRAYLIST
		//Arraylist<Tipo de obejero int char,,,>nombre a dar = new Arraylis<Tipo de objerto>();
		ArrayList<String> saludos = new ArrayList<String>();
		saludos.add("hola");
		saludos.add("hellow");
		saludos.add("bonjour");
		saludos.add("chao");
		saludos.add("czesc");
		saludos.add(2, "ni hao");
		
		saludos.clear();
		
		System.out.println(saludos.toString());
		
		int n=30;
		int r;
		ArrayList<Integer> divisores =new ArrayList<Integer>();
		
		for(int i=1; i<50;i++){
			r=n%i;
			if(r==0){
				divisores.add(i);
			}
		}
		System.out.println(divisores.toString());
		
		System.out.println(divisores.contains(15));
		System.out.println(divisores.lastIndexOf(15));
	}
}
