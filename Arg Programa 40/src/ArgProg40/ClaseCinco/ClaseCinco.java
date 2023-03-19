package ArgProg40.ClaseCinco;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

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


class Persona {
    private String nombre;
    private String apellido;
    private LocalDateTime fechadeNacimiento;

    public Persona() {

    }
    public Persona(String nombre, String apellido, LocalDateTime fechadeNacimiento) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().charAt(0) + nombre.substring(1, nombre.length()).toLowerCase();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido.toUpperCase().charAt(0) + apellido.substring(1, apellido.length()).toLowerCase();

    }

    public LocalDateTime getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(LocalDateTime fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}

class Descuento {
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
}

class Producto {
    private String descipcion;
    private float precio;

    public Producto() {

    }
    public Producto(String descipcion, float precio) {
        this.descipcion = descipcion;
        this.precio = precio;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Descipcion='" + descipcion + '\'' +
                ", Precio=" + precio ;
    }
    

}

class itemCarrito {
    private int cantidad;
    private Producto itemProducto;
    private float precioUnitario;

    public itemCarrito() {
    }

    public itemCarrito(int cantidad, Producto itemProducto) {
        this.cantidad = cantidad;
        this.itemProducto = itemProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;
        this.precioUnitario = cantidad + this.itemProducto.getPrecio();
    }

    public Producto getItemProducto() {
        return itemProducto;
    }

    public void setItemProducto(Producto itemProducto) {
        this.itemProducto = itemProducto;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }


    public float costoItemCarrito(){
        return cantidad* getItemProducto().getPrecio();
    }

    @Override
    public String toString() {
        return "itemCarrito{" +
                "cantidad=" + cantidad +
                ", itemProducto=" + itemProducto.getDescipcion()+ " precio" + itemProducto.getPrecio()+
                '}';
    }
}

class carrito{
    private itemCarrito item1;
    private itemCarrito item2;
    private itemCarrito item3;
    private Persona cliente;
    private DescuentoBanco descuentoBanco;
    private DescuentoTienda descuentoTienda;

    public carrito() {
    }

    public carrito(Persona cliente) {
        this.cliente = cliente;
    }

    public itemCarrito getItem1() {
        return item1;
    }

    public void setItem1(itemCarrito item1) {
        this.item1 = item1;
    }

    public itemCarrito getItem2() {
        return item2;
    }

    public void setItem2(itemCarrito item2) {
        this.item2 = item2;
    }

    public itemCarrito getItem3() {
        return item3;
    }

    public void setItem3(itemCarrito item3) {
        this.item3 = item3;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public DescuentoBanco getDescuentoBanco() {
        return descuentoBanco;
    }

    public void setDescuentoBanco(DescuentoBanco descuentoBanco) {
        this.descuentoBanco = descuentoBanco;
    }

    public DescuentoTienda getDescuentoTienda() {
        return descuentoTienda;
    }

    public void setDescuentoTienda(DescuentoTienda descuentoTienda) {
        this.descuentoTienda = descuentoTienda;
    }


    public float precio(){
        float precio1=0;
        float precio2=0;
        float precio3=0;
        if (item1!=null) precio1=item1.costoItemCarrito();
        if (item2!=null) precio2=item2.costoItemCarrito();
        if (item3!=null) precio3=item3.costoItemCarrito();

        return precio1+precio2+precio3;

    }

}