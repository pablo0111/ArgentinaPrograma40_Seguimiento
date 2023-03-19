package ArgProg40.ClaseCinco;

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
        if (this.descuentoProducto != null) {
            return this.descuentoProducto.valorFinal(this.precio);
        } else return precio;

    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public void setDescuentoFijo(float valor) {
        this.descuentoProducto = new DescuentoFijo();
        this.descuentoProducto.setValor(valor);

    }

    public void setDescuentoPorcentaje(float valor) {
        this.descuentoProducto = new DescuentoPorcentaje();
        this.descuentoProducto.setValor(valor);
    }

    public void setDescuentoPorcentajeConTope(float valor, float tope) {
        this.descuentoProducto = new DescuentoPorcentajeConTope(tope);
        this.descuentoProducto.setValor(valor);
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
                ", Precio= " + precio;
    }


}
