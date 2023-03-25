//PUNTO 2 A CLASE OCHO
package ArgProg40.ClaseOcho;

import ArgProg40.ClaseCinco.Producto;

public class DescuentoNegativoException extends Throwable {
    private final Producto producto;
    private final String mensaje= "El descuento es mayor o igual al monto a pagar";
    public DescuentoNegativoException(Producto producto) {
        this.producto = producto;
    }
    @Override
    public String toString() {
        return this.mensaje;
    }
}
