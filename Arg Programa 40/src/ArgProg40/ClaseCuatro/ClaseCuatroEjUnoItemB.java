package ArgProg40.ClaseCuatro;
import ArgProg40.MiScanner;
public class ClaseCuatroEjUnoItemB {
    public static void main(String[] args) {


        int vectorInicial[] =new int[3];
        char orden;

        //Carga de datos
        System.out.println("A continuacion ingrese tres numeros enteros:");
        for (int i = 0; i < 3; i++) {
            vectorInicial[i]= MiScanner.leerInt() ;
        }
        System.out.println("Ingrese 'a' para orden Ascendente o 'b' para orden Descendente");
        char limitacion[]= {'a','d'};
        orden = MiScanner.leerCaracter(limitacion);


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
