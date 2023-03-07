public class ClaseTresEjUnoItemB {
    public static void main(String[] args) {

        int vectorInicial[] = {23, 6, 264};
        boolean ordenAscendente = true;

        if (ordenAscendente == true) {
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






