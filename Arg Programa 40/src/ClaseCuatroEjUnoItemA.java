public class ClaseCuatroEjUnoItemA {

    public static void main(String[] args) {
        int vectorInicial[] =new int[args.length-1];
        char orden;

        //Carga de datos
        for (int i = 0; i < args.length-1; i++) {
            vectorInicial[i]= Integer.parseInt(args[i]) ;
        }
        orden = args[args.length-1].charAt(0);

        //si orden es cualquier letra, pongo 'a'scendente
        if (orden!='a' && orden!='d') orden = 'a';


        if (orden=='a') {
            System.out.println("Orden Ascendente");
            boolean termine = false;
            while (!termine) {
                boolean intercambie = false;
                for (int i = 0; i < vectorInicial.length - 1; i++) {
                    if (vectorInicial[i] > vectorInicial[i + 1]) {
                        int aux = vectorInicial[i];
                        vectorInicial[i] = vectorInicial[i + 1];
                        vectorInicial[i + 1] = aux;
                        intercambie = true;
                    } else if ((i == vectorInicial.length - 2) && !intercambie) {
                        termine = true;
                    }
                }
            }
        } else {
            boolean termine = false;
            System.out.println("Orden Descendente");
            while (!termine) {
                boolean intercambie = false;
                for (int i = 0; i < vectorInicial.length - 1; i++) {
                    if (vectorInicial[i] < vectorInicial[i + 1]) {
                        int aux = vectorInicial[i];
                        vectorInicial[i] = vectorInicial[i + 1];
                        vectorInicial[i + 1] = aux;
                        intercambie = true;
                    } else if ((i == vectorInicial.length - 2) && !intercambie) {
                        termine = true;
                    }
                }
            }
        }

        for (int i = 0; i < vectorInicial.length; i++) {
            System.out.println(vectorInicial[i]);
        }

    }
}
