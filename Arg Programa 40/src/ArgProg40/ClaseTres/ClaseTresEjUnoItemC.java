package ArgProg40.ClaseTres;
public class ClaseTresEjUnoItemC {
    public static void main(String[] args) {
        int vectorNumerico[] = {1,11,16,55,63,44,31,10,81,4,77,24,18,14,20,27,45,22,23,2};
        int x = 30;
        int resultado=0;

        for (int i=0; i< vectorNumerico.length; i++) {
            if (vectorNumerico[i] > x) {
                resultado = resultado + vectorNumerico[i];
            }
        }

        System.out.println("Numeros del vector: ");

        for (int i=0; i< vectorNumerico.length; i++){
                System.out.print(vectorNumerico[i]+",");
            }
        System.out.println();
        System.out.println("La sumatoria de los valores mayores a X= \""+x+"\"");
        System.out.println("Total: "+resultado);
        }







    }

