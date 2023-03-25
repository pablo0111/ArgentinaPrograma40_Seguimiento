package ArgProg40.ClaseOcho;

import ArgProg40.ClaseCinco.Carrito;
import ArgProg40.ClaseCinco.ItemCarrito;
import ArgProg40.ClaseCinco.Persona;
import ArgProg40.ClaseCinco.Producto;

import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.time.LocalDateTime;

public class ClaseOcho {

    public static void main(String[] args) throws IOException, DescuentoNegativoException, CarritoSinItemsException {
        Persona persona;
        LocalDateTime nacimiento = LocalDateTime.of(1980,1,1,7,24);
        Producto producto1;
        Producto producto2;
        ItemCarrito itemCarrito1;
        ItemCarrito itemCarrito2;
        CarritoV2 unCarrito;


        System.out.println("Creo un producto");
        producto1= new Producto("Naranja", 66.5f);
        //PUNTO 2 C CLASE OCHO
        try {
            System.out.println("Intento aplicar un descuento de 50%");
            producto1.setDescuentoPorcentaje(50f);
            System.out.println("Descuento aplicado con exito");
        } catch (DescuentoNegativoException ex) {
            System.out.println("No se puede aplicar el descuento deseado");
            System.out.println(ex.toString());
        }
        producto1.eliminarDescuento();
        try {
            System.out.println("Intento aplicar un descuento con porcenta y tope de 150%/5000");
            producto1.setDescuentoPorcentajeConTope(150, 5000);
            System.out.println("Descuento aplicado con exito");
        } catch (DescuentoNegativoException ex) {
            System.out.println("No se puede aplicar el descuento deseado");
            System.out.println(ex.toString());
        }


        System.out.println("Producto1 creado como :" + producto1.toString());

        System.out.println("DATOS PARA CARRITO");
        System.out.println("------------------");
        System.out.println();
        System.out.println("Creo un producto");
        producto2= new Producto("Pomelo", 48.99f);
        System.out.println("Producto2 creado como :" + producto2.toString());

        System.out.println("Creo un item Carrito");
        itemCarrito1= new ItemCarrito(2,producto1);
        System.out.println("item carrito 1 "+ itemCarrito1.toString());

        System.out.println("Creo un item Carrito");
        itemCarrito2= new ItemCarrito(2,producto2);
        System.out.println("item carrito 1 "+ itemCarrito2.toString());

        System.out.println("Creo un carrito");
        unCarrito= new CarritoV2();
        //PUNTO 2 C CLASE OCHO
        try{
            unCarrito.setDescuentoFijo(500f);
        } catch (CarritoSinItemsException ex) {
            System.out.println("No se puede aplicar el descuento");
            System.out.println(ex.toString());
        }


        System.out.println("Agrego itemCarrito1");
        unCarrito.setItems(itemCarrito1);
        System.out.println("Agregue producto1 , costo carrito:" + unCarrito.precio());
        System.out.println("Agrego itemCarrito2");
        unCarrito.setItems(itemCarrito2);
        System.out.println("Agregue producto2 , costo carrito:" + unCarrito.precio());


        //PUNTO 2

        CarritoV2 otroCarrito = new CarritoV2();
        ItemCarrito iteraItemCarrito = new ItemCarrito();
        for (String linea : Files.readAllLines(Paths.get(".\\CarritoV2.txt").toAbsolutePath())){
            String arr[]= linea.split(",");
            iteraItemCarrito = new ItemCarrito(Integer.parseInt(arr[0]), new Producto(arr[2],Float.parseFloat(arr[1])));
            otroCarrito.setItems(iteraItemCarrito);

        }


        System.out.println("Se genero un carrito con la siguiente informacion");


        for (int i = 0; i < otroCarrito.length(); i++) {
            System.out.println("Item en posicion " + i + " :");
            System.out.println(otroCarrito.getItems(i).toString());

        }

        System.out.println("Precio total del Carrito cargado: " + otroCarrito.precio());
    }
}
