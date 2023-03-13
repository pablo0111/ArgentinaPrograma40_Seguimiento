public class ClaseCuatroEjUnoItemC {

    public static int[] ordenAscendente(int[] vector) {
        boolean termine = false;
        while (!termine) {
            boolean intercambie = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    int aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    intercambie = true;
                } else if ((i == vector.length - 2) && !intercambie) {
                    termine = true;
                }
            }
        }
        return vector;
    }
    public static int[] ordenDescendente(int[] vector) {

        boolean termine = false;
        while (!termine) {
            boolean intercambie = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] < vector[i + 1]) {
                    int aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    intercambie = true;
                } else if ((i == vector.length - 2) && !intercambie) {
                    termine = true;
                }
            }
        }
        return vector;
    }

    public static void main(String[] args) {
        int vectorInicial[];
        char orden;

        //Verifico si hay parametros, si hay, los cargo
        if (args.length > 3) {
            vectorInicial = new int[args.length - 1];
            //Carga de datos
            for (int i = 0; i < args.length-1; i++) {
                vectorInicial[i]= Integer.parseInt(args[i]) ;
            }
            orden = args[args.length-1].charAt(0);

            //si orden es cualquier letra, pongo 'a'scendente
            if (orden!='a' && orden!='d') orden = 'a';
        } else { //no hay datos, entonces los pido
            //Carga de datos
            vectorInicial = new int[3];
            System.out.println("A continuacion ingrese tres numeros enteros:");
            for (int i = 0; i < 3; i++) {
                vectorInicial[i]= MiScanner.leerInt() ;
            }
            System.out.println("Ingrese 'a' para orden Ascendente o 'b' para orden Descendente");
            char limitacion[]= {'a','d'};
            orden = MiScanner.leerCaracter(limitacion);

        }

        switch (orden) {
            case 'a':
                System.out.println("Orden Ascendente");
                vectorInicial=ordenAscendente(vectorInicial);
                break;
            case 'd':
                System.out.println("Orden Descendente");
                vectorInicial=ordenDescendente(vectorInicial);
                break;

        }

        for (int i = 0; i < vectorInicial.length; i++) {
            System.out.println(vectorInicial[i]);
        }



    }

}
