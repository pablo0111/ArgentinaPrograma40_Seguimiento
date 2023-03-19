package ArgProg40.ClaseCinco;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import ArgProg40.ClaseSiete.*;


public class ClaseCinco {
    public static void main(String[] args) throws IOException {
        Persona persona;
        LocalDateTime nacimiento = LocalDateTime.of(1980,1,1,7,24);
        Producto producto1;
        Producto producto2;
        itemCarrito itemCarrito1;
        itemCarrito itemCarrito2;
        carrito unCarrito;

        //PUNTO 1
        System.out.println("Creo una persona");
        persona = new Persona("HarRy","pottER",nacimiento);
        System.out.println("Persona Creada como " + persona.toString());

        System.out.println("Creo un producto");
        producto1= new Producto("Naranja", 66.5f);
        System.out.println("Producto1 creado como :" + producto1.toString());

        System.out.println("Creo un producto");
        producto2= new Producto("Pomelo", 48.99f);
        System.out.println("Producto2 creado como :" + producto2.toString());

        System.out.println("Creo un item Carrito");
        itemCarrito1= new itemCarrito(2,producto1);
        System.out.println("item carrito 1 "+ itemCarrito1.toString());

        System.out.println("Creo un item Carrito");
        itemCarrito2= new itemCarrito(2,producto2);
        System.out.println("item carrito 1 "+ itemCarrito2.toString());

        System.out.println("Creo un carrito");
        unCarrito= new carrito(persona);
        System.out.println("Agrego itemCarrito1");
        unCarrito.setItem1(itemCarrito1);
        System.out.println("Agregue producto1 , costo carrito:" + unCarrito.precio());
        System.out.println("Agrego itemCarrito2");
        unCarrito.setItem2(itemCarrito2);
        System.out.println("Agregue producto2 , costo carrito:" + unCarrito.precio());


        //PUNTO 2
        int contador=0;
        itemCarrito arrayItemCarrito[] = new itemCarrito[3];
        for (String linea : Files.readAllLines(Paths.get(".\\Carrito.txt").toAbsolutePath())){
            String arr[]= linea.split(",");
            arrayItemCarrito[contador] = new itemCarrito(Integer.parseInt(arr[0]), new Producto(arr[2],Float.parseFloat(arr[1])));
            contador++;
        }
        carrito otroCarrito = new carrito(persona);
        otroCarrito.setItem1(arrayItemCarrito[0]);
        otroCarrito.setItem2(arrayItemCarrito[1]);
        otroCarrito.setItem3(arrayItemCarrito[2]);

        System.out.println("Se genero un carrito con la siguiente informacion");
        System.out.println(otroCarrito.getCliente().toString());
        System.out.println(otroCarrito.getItem1().toString());
        System.out.println(otroCarrito.getItem2().toString());
        System.out.println(otroCarrito.getItem3().toString());
        System.out.println("Precio total del Carrito cargado: " + otroCarrito.precio());




    }


}


/*class Descuento {
    private float porcentaje;
    private  boolean acumulable;

    public Descuento(float porcentaje, boolean acumulable) {
        this.porcentaje = porcentaje;
        this.acumulable = acumulable;
    }

    public Descuento() {
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public boolean isAcumulable() {
        return acumulable;
    }

    public void setAcumulable(boolean acumulable) {
        this.acumulable = acumulable;
    }
}

class DescuentoBanco extends Descuento{
    private String banco;


    public DescuentoBanco(float porcentaje, boolean acumulable) {
        super(porcentaje, acumulable);
    }

    public DescuentoBanco(float porcentaje, boolean acumulable, String banco){
        super(porcentaje, acumulable);
        this.banco = banco;

    }


}

class DescuentoTienda extends Descuento{
    private float tope;

    public DescuentoTienda(float porcentaje, boolean acumulable, float tope) {
        super(porcentaje, acumulable);
        this.tope = tope;
    }

    public DescuentoTienda(float tope) {
        this.tope = tope;
    }

    public float getTope() {
        return tope;
    }

    public void setTope(float tope) {
        this.tope = tope;
    }
}*/

//REDEFINO CLASES DESCUENTOS en ARCHIVO SEPARADO PACKAGE CLASESIETE


