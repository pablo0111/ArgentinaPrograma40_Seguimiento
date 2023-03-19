package ArgProg40.ClaseUno;
public class Clase1_Ej2 {
    public static void main(String[] args) {
        //valores con los minimos requeridos en todas las variables de entrada
        float ingresos_hogar= 489082;
        short vehiculos_con_menos_de_5_anos= 2;
        short inmuebles = 2;
        short embarcaciones = 0;
        short aeronaves_de_lujo = 1;
        boolean activos_societarios = false;

        if ( (ingresos_hogar>= 489083) || (vehiculos_con_menos_de_5_anos >=3)
            || (inmuebles >=3) || (embarcaciones>=1) || (aeronaves_de_lujo >=1)
                || (activos_societarios)
        ) {
            System.out.println("Califica como ALTOS INGRESOS");
        } else {
            System.out.println("NO califica como altos ingresos, se descarta");
        };

    }
}
