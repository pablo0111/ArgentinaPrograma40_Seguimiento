//PUNTO 2 A CLASE OCHO
package ArgProg40.ClaseOcho;

public class CarritoSinItemsException extends Exception {
    private final CarritoV2 carrito;
    private final String mensaje= "No se puede aplicar un descuento a un carrito vacio";
    public CarritoSinItemsException(CarritoV2 carrito) {
            this.carrito = carrito;
        }
    @Override
    public String toString() {
        return this.mensaje;
    }
}
