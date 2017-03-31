class Principal{

    public static void main(String[] args){

        int [] numeros_imp = new int [5];

        int [] numeros_par = {2,4,6,8,10};

        String [] palabras = {"Pato","Rana","Pavo"};

        System.out.println("Longitud del array:"+numeros_par.length);

        for(int i=0; i<numeros_par.length; i++){

            System.out.println(numeros_par[i]);
        }
    }
}
