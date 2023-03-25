package ArgProg40.ClaseCinco;

import ArgProg40.ClaseOcho.DescuentoNegativoException;
import ArgProg40.ClaseSiete.Descuento;
import ArgProg40.ClaseSiete.DescuentoFijo;
import ArgProg40.ClaseSiete.DescuentoPorcentaje;
import ArgProg40.ClaseSiete.DescuentoPorcentajeConTope;

public class Producto {
    private String descipcion;
    private float precio;
    private Descuento descuentoProducto;

    public Producto() {

    }

    public Producto(String descipcion, float precio) {

        this.setDescipcion(descipcion);
        this.setPrecio(precio);

    }


    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public float getPrecio() {
        if (this.descuentoProducto != null) {
            return this.descuentoProducto.valorFinal(this.precio);
        } else return precio;

    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public void setDescuentoFijo(float valor) throws DescuentoNegativoException {
        this.descuentoProducto = new DescuentoFijo();
        if (valor< this.getPrecio()) {
            this.descuentoProducto.setValor(valor);
        } else throw new DescuentoNegativoException(this);


    }

    public void setDescuentoPorcentaje (float valor) throws DescuentoNegativoException {
        this.descuentoProducto = new DescuentoPorcentaje();
        if (valor < 100) {
            this.descuentoProducto.setValor(valor);
        } else throw new DescuentoNegativoException(this);

    }

    public void setDescuentoPorcentajeConTope(float valor, float tope) throws DescuentoNegativoException {
        this.descuentoProducto = new DescuentoPorcentajeConTope(tope);
        this.descuentoProducto.setValor(valor);
        if (this.descuentoProducto.valorFinal(this.precio) == 0) {
            this.descuentoProducto = null;
            throw new DescuentoNegativoException(this);
        }
    }

    public String getTipoDescuento() {
        String resultado = "Descuento no asignado";
        if (this.descuentoProducto != null) {
            if (this.descuentoProducto instanceof DescuentoFijo) {
                resultado = "Descuento Fijo: " + this.descuentoProducto.getValor();
            } else if (this.descuentoProducto instanceof DescuentoPorcentajeConTope) {
                resultado = "Descuento con Porcentaje: " + this.descuentoProducto.getValor() + " y con el Tope: "+ ((DescuentoPorcentajeConTope)this.descuentoProducto).getTope() ;
            } else if (this.descuentoProducto instanceof DescuentoPorcentaje) {
                resultado = "Descuento Porcentaje: " + this.descuentoProducto.getValor();
            }

        }
        return resultado;
    }

    public float getDescuentoProducto() {
        return descuentoProducto.getValor();
    }

    public void eliminarDescuento() {
        this.descuentoProducto = null;
    }

    @Override
    public String toString() {
        return "Descipcion= '" + descipcion + '\'' +
                ", Precio= " + this.getPrecio();
    }


}
