import java.util.Scanner;

public class Clase1_Ej1 {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        int contador = 0;
        // PUNTO a
        //SIN VARIABLES EXTRAS:
        System.out.println("Imprimo todos los números entre los valores dados:");
        System.out.println("Valor inicial: "+numeroInicio);
        System.out.println("Valor final: "+numeroFin);
        System.out.println();
        while (numeroInicio <= numeroFin){
            System.out.println("Imprimo el número: " + numeroInicio);
            numeroInicio++;
        }
        System.out.println("Valor final de numeroInicio: "+numeroInicio);

        // PUNTO b
        //reseteo de numeroinicio
        numeroInicio = 5;
        System.out.println();
        System.out.println("Imprimo los números pares entre los valores dados:");
        System.out.println("Valor inicial: "+numeroInicio);
        System.out.println("Valor final: "+numeroFin);
        System.out.println();
        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.println("Imprimo el número: " + numeroInicio);
            }
            numeroInicio++;
        }
        System.out.println("Valor final de numeroInicio: "+numeroInicio);

        // PUNTO a con variable extra
        //reseteo de numeroinicio e inicio contador
        numeroInicio = 5;
        contador = numeroInicio;
        System.out.println();
        System.out.println("Imprimo todos los números entre los valores dados: (variable contador)");
        System.out.println("Valor inicial: "+numeroInicio);
        System.out.println("Valor final: "+numeroFin);
        System.out.println();
        while (contador <= numeroFin){
            System.out.println("Imprimo el número: " + contador);
            contador++;
        }
        System.out.println("Valor final de numeroInicio: "+numeroInicio);

        // PUNTO b con variable extra
        //inicio contador
        contador = numeroInicio;
        System.out.println();
        System.out.println("Imprimo los números pares entre los valores dados: (variable contador)");
        System.out.println("Valor inicial: "+numeroInicio);
        System.out.println("Valor final: "+numeroFin);
        System.out.println();
        while (contador <= numeroFin){
            if (contador % 2 == 0) {
                System.out.println("Imprimo el número: " + contador);
            }
            contador++;
        }
        System.out.println("Valor final de numeroInicio: "+numeroInicio);

        // PUNTO c con variable de seleccion
        //variables extras
        Scanner lectura = new Scanner(System.in);
        String decision;
        System.out.println("Ahora con decision de usuario");
        System.out.println("Podes decidir ver pares o impares:");
        System.out.println("1. Quiero ver números pares!");
        System.out.println("2. Quiero ver números impares!");
        do {
            decision = lectura.nextLine();
        }  while (( (!decision.equals("1") ) && (!decision.equals("2")) ));

        switch (decision) {
            case "1": {
                //inicio contador
                contador = numeroInicio;
                System.out.println();
                System.out.println("Tu elección fue: Numeros Pares!");
                System.out.println();
                System.out.println("Imprimo los números pares entre los valores dados: (variable contador)");
                System.out.println("Valor inicial: "+numeroInicio);
                System.out.println("Valor final: "+numeroFin);
                System.out.println();
                while (contador <= numeroFin){
                    if (contador % 2 == 0) {
                        System.out.println("Imprimo el número: " + contador);
                    }
                    contador++;
                }
            } break;
            case "2": {
                //inicio contador
                contador = numeroInicio;
                System.out.println();
                System.out.println("Tu elección fue: Números Impares!");
                System.out.println();
                System.out.println("Imprimo los números impares entre los valores dados: (variable contador)");
                System.out.println("Valor inicial: "+numeroInicio);
                System.out.println("Valor final: "+numeroFin);
                System.out.println();
                while (contador <= numeroFin){
                    if (contador % 2 != 0) {
                        System.out.println("Imprimo el número: " + contador);
                    }
                    contador++;
                }
            }break;


        }
    // PUNTO d
        System.out.println();
        System.out.println("Imprimo números pares del mas alto al mas bajo");
        System.out.println("Valor menor: "+numeroInicio);
        System.out.println("Valor mayor: "+numeroFin);
        for (contador = numeroFin; contador >= numeroInicio; contador--)
        {
            if (contador % 2 == 0) {
                System.out.println("Imprimo el número: " + contador);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Fin ejecución Ejercicio 1 de la Clase 1");
    }
}