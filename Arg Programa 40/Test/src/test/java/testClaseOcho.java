import ArgProg40.ClaseCinco.Carrito;
import ArgProg40.ClaseCinco.ItemCarrito;
import ArgProg40.ClaseCinco.Persona;
import ArgProg40.ClaseCinco.Producto;
import ArgProg40.ClaseOcho.CarritoSinItemsException;
import ArgProg40.ClaseOcho.CarritoV2;
import ArgProg40.ClaseOcho.DescuentoNegativoException;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class testClaseOcho {
    @Test(expected=CarritoSinItemsException.class)
    public void casoDePrueba1() throws CarritoSinItemsException {

        CarritoV2 unCarrito;
        unCarrito= new CarritoV2();
        unCarrito.setDescuentoFijo(500f);


    }

    @Test(expected=CarritoSinItemsException.class)
    public void casoDePrueba2() throws CarritoSinItemsException {
    //TEST PARA PROBAR QUE NO DA LA EXCEPCION
        CarritoV2 unCarrito;
        unCarrito= new CarritoV2();
        unCarrito.setItems(new ItemCarrito(2,new Producto("Pomelo", 48.99f)));
        unCarrito.setDescuentoFijo(500f);


    }


    @Test(expected=DescuentoNegativoException.class)
    public void casoDePrueba3() throws  DescuentoNegativoException {

        Producto producto1;
        producto1= new Producto("Naranja", 66.5f);
        producto1.setDescuentoPorcentaje(50f); //NO ARROJA EXCEPTION
        producto1.eliminarDescuento();
        producto1.setDescuentoPorcentajeConTope(150, 5000); //SI ARROJA EXCEPTION




    }


}




//
//public class testDescuentos {
//
//    @Test
//    public void casoDePrueba1(){
//        Producto producto1;
//
//        //Creo un producto
//        producto1= new Producto("Televisor", 66499.99f);
//        Assert.assertEquals("Televisor", producto1.getDescipcion());
//        Assert.assertEquals(66499.99f, producto1.getPrecio(),0.001);
//
//    }
//
//    @Test
//    public void casoDePrueba2(){
//        //PRUEBA PARA SABER QUE UN PRODUCTO NO TIENE DESCUENTOS ASIGNADOS
//        Producto producto1;
//        //creo un producto
//        producto1= new Producto("Televisor", 66499.99f);
//        producto1.setDescuentoPorcentaje(30f);
//        producto1.eliminarDescuento();
//        Assert.assertEquals("Descuento no asignado", producto1.getTipoDescuento());
//        Assert.assertEquals(66499.99f, producto1.getPrecio(), 0.001);
//
//    }
//
//    @Test
//    public void casoDePrueba3(){
//
//        Producto producto1;
//        Producto producto2;
//
//
//        //Creo un producto
//        producto1= new Producto("Televisor", 66499.99f);
//
//        //Creo otro producto y le asigno un descuento
//        producto2= new Producto("Parlantes", 4899.99f);
//        producto2.setDescuentoPorcentajeConTope(15f, 500);
//
//
//        Assert.assertEquals("Descuento no asignado", producto1.getTipoDescuento());
//        Assert.assertEquals("Descuento con Porcentaje: 0.15 y con el Tope: 500.0", producto2.getTipoDescuento());
//        Assert.assertEquals(4399.99f,producto2.getPrecio(),0.001);
//        Assert.assertEquals(66499.99f, producto1.getPrecio(), 0.001);
//
//
//    }
//
//    @Test
//    public void casoDePrueba4(){
//        Persona persona;
//        LocalDateTime nacimiento = LocalDateTime.of(1980,1,1,7,24);
//        Producto producto1;
//        Producto producto2;
//        ItemCarrito itemCarrito1;
//        ItemCarrito itemCarrito2;
//        Carrito unCarrito;
//
//        //creo una persona para el carrito
//        persona = new Persona("HarRy","pottER",nacimiento);
//
//        //Creo un producto
//        producto1= new Producto("Televisor", 66499.99f);
//
//        //Creo otro producto y le asigno un descuento
//        producto2= new Producto("Parlantes", 4899.99f);
//        producto2.setDescuentoPorcentajeConTope(15f, 500);
//        //Creo un item carrito1
//        itemCarrito1= new ItemCarrito(1,producto1);
//
//        //Creo un item carrito2
//        itemCarrito2= new ItemCarrito(2,producto2);
//
//        //Creo un carrito y le agrego los dos items
//        unCarrito= new Carrito(persona);
//        unCarrito.setItem1(itemCarrito1);
//        unCarrito.setItem2(itemCarrito2);
//
//        Assert.assertEquals(75299.97f,unCarrito.precio(),0.001);
//
//
//    }
//    @Test
//    public void casoDePrueba5() throws DescuentoNegativoException {
//        Producto producto1;
//
//        //Creo un producto
//        producto1= new Producto("Televisor", 66499.99f);
//        producto1.setDescuentoFijo(15000f);
//
//        Assert.assertEquals("Televisor", producto1.getDescipcion());
//        Assert.assertEquals(51499.99f, producto1.getPrecio(),0.01);
//
//    }
//
//    @Test
//    public void casoDePrueba6() throws DescuentoNegativoException {
//        Producto producto1;
//
//        //Creo un producto
//        producto1= new Producto("Televisor", 70000f);
//        producto1.setDescuentoPorcentaje(50f);
//
//        Assert.assertEquals("Televisor", producto1.getDescipcion());
//        Assert.assertEquals(35000f, producto1.getPrecio(),0.001);
//
//    }
//
//
//}
