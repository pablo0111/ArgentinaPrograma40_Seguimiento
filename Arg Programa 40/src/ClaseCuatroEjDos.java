import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


public class ClaseCuatroEjDos {

    public static void main(String[] args) throws IOException {
    //"C:\Users\pablo\Documents\Proyectos\ArgentinaPrograma40_Seguimiento\Arg Programa 40\src\Numeros.txt" llega como args

        System.out.println("Muestro los numeros del archivo: ");
        for (String linea : Files.readAllLines(Paths.get(args[0]))){
            System.out.println(linea);
        }


        if (args.length>1) {
            if (args[1].equals("-s") || args[1].equals("-m")) {
                System.out.println("Se ingresó el parametro " + args[1].toString());
                if (args[1].equals("-s")) {
                    int suma = 0;
                    for (String linea : Files.readAllLines(Paths.get(args[0]))) {
                        suma = suma + Integer.parseInt(linea);
                    }
                    System.out.println("Se suman los valores y el resultado es: " + suma);
                } else {
                    long multiplicacion = 1;
                    for (String linea : Files.readAllLines(Paths.get(args[0]))) {
                        multiplicacion = multiplicacion * Integer.parseInt(linea);
                    }
                    System.out.println("Se multiplican los valores y el resultado es: " + multiplicacion);
                }
            }
        }
    }




}

