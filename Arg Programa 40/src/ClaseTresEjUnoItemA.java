public class ClaseTresEjUnoItemA {
    public static void main(String[] args) {

      //Prueba pregunta cuestionario 5
        String texto=  "hola que tal?".toUpperCase().replace("hola","chau");
        System.out.println(texto); //no encuentra hola porque ahora es HOLA
        texto=  "hola que tal?".toUpperCase().replace("HOLA","chau");
        System.out.println(texto); //cambiando el replace por HOLA, si encuentra y reemplaza la palabra


        //EJERCICIO 1 PUNTO a
        texto = "Hola Mundo, estoy programando en Java!";
        char letra = 'a';
        int repeticiones = 0;

        for (int i=0; i<texto.length(); i++) {
            if (letra == texto.charAt(i)) {
            repeticiones++;
            }
        }
        System.out.println(texto);
        System.out.println("La letra \"" + letra + "\" aparece en el texto: "+ repeticiones + " veces");

        //EJERCICIO 1 PUNTO a sin charAt
        char otroTexto[] = {'H','o','l','a', ' ','M','u','n','d','o','!'};
        repeticiones =  0; //vuelvo a 0 el contador de repeticiones
        for (int i=0; i<otroTexto.length; i++) {
            if (letra == otroTexto[i]) {
                repeticiones++;
            }
        }

        System.out.println();
        for (int i=0; i<otroTexto.length; i++) {
            System.out.print(otroTexto[i]);
        }
        System.out.println();
        System.out.println("La letra \"" + letra + "\" aparece en el texto: "+ repeticiones + " veces");

        //EJERCICIO 1 PUNTO a sin charAt v2
        //uso charAt para cargar el vector solamente para tener textos más largos rapidamente
        texto = "Para tener una referencia completa de la cantidad de cosas que se pueden\n" +
                "hacer con String, y de paso para ir rompiendo el hielo, puede consultar el\n" +
                "JavaDoc de la misma";
        char unTextoMas[] = new char[texto.length()];
        repeticiones =  0; //vuelvo a 0 el contador de repeticiones
        //cargo el vector de caracteres
        for (int i=0; i < unTextoMas.length; i++) {
            unTextoMas[i]=texto.charAt(i);
        }

        for (int i=0; i<unTextoMas.length; i++) {
            if (letra == unTextoMas[i]) {
                repeticiones++;
            }
        }

        System.out.println();
        for (int i=0; i<unTextoMas.length; i++) {
            System.out.print(unTextoMas[i]);
        }
        System.out.println();
        System.out.println("La letra \"" + letra + "\" aparece en el texto: "+ repeticiones + " veces");


    }

}
