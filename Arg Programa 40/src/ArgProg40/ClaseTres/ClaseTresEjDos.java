package ArgProg40.ClaseTres;
public class ClaseTresEjDos {

    public static String decodificador(String var, int desplazamiento){
       char aux[] = var.toLowerCase().toCharArray();
       char diccionario[] = " abcdefghijklmnñopqrstuvwxyz".toCharArray();
       String resultado="";

       //Character.isUpperCase()
       for (int i=0; i<aux.length; i++) {
           int factor = 0;
           //busco la letra en dicccionario
           int ubicacion=0;
           boolean encontrado= false;
           while (!encontrado){
               if (aux[i]==diccionario[ubicacion]) {
                   encontrado= true;
               } else ubicacion++;
           }
           //verifico si la letra cuando le aplique el desplazamiento sale fuera de rango
           if ((ubicacion-desplazamiento)<0) {
               factor = diccionario.length;

           }


           if (Character.isUpperCase(var.charAt(i))) {
            //cambio por la letra + paso
               resultado = resultado + (Character.toUpperCase(diccionario[ubicacion-desplazamiento+factor]));
           } else {
               resultado = resultado + diccionario[ubicacion-desplazamiento+factor];
           }




       }

       return resultado;
    }

    public static String codificador(String var, int desplazamiento){
        char aux[] = var.toLowerCase().toCharArray();
        char diccionario[] = " abcdefghijklmnñopqrstuvwxyz".toCharArray();
        String resultado="";

        //Character.isUpperCase()
        for (int i=0; i<aux.length; i++) {
            int factor = 0;
            //busco la letra en dicccionario
            int ubicacion=0;
            boolean encontrado= false;
            while (!encontrado){
                if (aux[i]==diccionario[ubicacion]) {
                    encontrado= true;
                } else ubicacion++;
            }
            //verifico si la letra cuando le aplique el desplazamiento sale fuera de rango
            if ((ubicacion+desplazamiento)>diccionario.length) {
                factor = diccionario.length;

            }


            if (Character.isUpperCase(var.charAt(i))) {
                //cambio por la letra + paso
                resultado = resultado + (Character.toUpperCase(diccionario[ubicacion+desplazamiento-factor]));
            } else {
                resultado = resultado + diccionario[ubicacion+desplazamiento-factor];
            }




        }

        return resultado;
    }

    public static void main(String[] args) {
        String texto = "hola que tal";
        int desplazamiento = 1;

        System.out.println("Texto original: " + texto);
        System.out.println("Texto codificado con desplazamiento " + desplazamiento + " :");
        System.out.println(codificador(texto, desplazamiento));
        System.out.println("Texto decodificado con desplazamiento " + desplazamiento + " :");
        System.out.println(decodificador(codificador(texto, desplazamiento),desplazamiento));



    }
}
