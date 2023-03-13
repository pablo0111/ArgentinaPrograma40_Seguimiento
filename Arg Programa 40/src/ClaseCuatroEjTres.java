import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ClaseCuatroEjTres {

    public static void main(String[] args) throws IOException {
        /* -d 2 .\\TextoInicial.txt .\\Resultado.txt / -c 2 .\\TextoInicial.txt .\\Resultado.txt
        args[0]= -d decodificar -c codificar
        args[1]= desplazamiento (integer)
        args[2]= archivo inicio
        args[3]= archivo resultado
         */
        System.out.println("Opciones ingresadas por parametro");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        if (args.length == 4) {
            //para poder decodificar por renglon primero cuento los renglones totales del archivo
            int cantidadLineas=0;
            for (String linea : Files.readAllLines(Paths.get(args[2]).toAbsolutePath())){
                cantidadLineas++;
            }
            //inicio un array por la cantidad total y lo cargo
            String texto[]= new String[cantidadLineas];
            int indice = 0;
            for (String linea : Files.readAllLines(Paths.get(args[2]).toAbsolutePath())){
                texto[indice]=linea;
                indice++;
            }
            if (args[0].equals("-c")) {
                String resultado[]= new String[cantidadLineas];
                //CODIFICADO
                for (int i = 0; i < texto.length; i++) {
                    resultado[i]=CifradoDesplazamiento.codificador(texto[i],Integer.parseInt(args[1])) ;
                }
                //GRABA EN ARCHIVO SALIDA
                Files.writeString(Paths.get(args[3]).toAbsolutePath(), resultado[0]+"\n");
                for (int i = 1; i < resultado.length; i++) {
                    Files.writeString(Paths.get(args[3]).toAbsolutePath(), resultado[i]+"\n",StandardOpenOption.APPEND);
                }
                System.out.println("Codificacion Exitosa");
            } else if (args[0].equals("-d")) {
                String resultado[]= new String[cantidadLineas];
                //DECODIFICADO
                for (int i = 0; i < texto.length; i++) {
                    resultado[i]=CifradoDesplazamiento.decodificador(texto[i],Integer.parseInt(args[1])) ;
                }
                //GRABA EN ARCHIVO SALIDA
                Files.writeString(Paths.get(args[3]).toAbsolutePath(), resultado[0]+"\n");
                for (int i = 1; i < resultado.length; i++) {
                    Files.writeString(Paths.get(args[3]).toAbsolutePath(), resultado[i]+"\n",StandardOpenOption.APPEND);
                }
                System.out.println("Decodificacion Exitosa");
            } else System.out.println("Parametro 1 incorrecto, debe ser -c Codificar o -d Decodificar. Se finaliza el programa.");



        } else System.out.println("No se recibieron la cantidad de parametros necesarios. Se finaliza el programa.");




    }

}
