//PUNTO 1 CLASE OCHO
package ArgProg40.ClaseOcho;

import ArgProg40.ClaseCinco.ItemCarrito;
import ArgProg40.ClaseCinco.Persona;
import ArgProg40.ClaseSiete.Descuento;
import ArgProg40.ClaseSiete.DescuentoFijo;
import ArgProg40.ClaseSiete.DescuentoPorcentaje;
import ArgProg40.ClaseSiete.DescuentoPorcentajeConTope;

import java.util.ArrayList;
import java.util.List;

public class CarritoV2 {

    private List<ItemCarrito> items;
//    private ItemCarrito item2;
//    private ItemCarrito item3;
    private Persona cliente;
    private Descuento descuentoCarrito;

    public CarritoV2() {
        //instancio el arraylist para los items
        items = new ArrayList<ItemCarrito>();
    }

    public CarritoV2(Persona cliente) {
        //instancio el arraylist para los items
        items = new ArrayList<ItemCarrito>();
        this.cliente = cliente;
    }

    public ItemCarrito getItems(int index) {
        return this.items.get(index);
    }

    public void setItems(ItemCarrito item) {
        this.items.add(item) ;
    }

//    public ItemCarrito getItem2() {
//        return item2;
//    }
//
//    public void setItem2(ItemCarrito item2) {
//        this.item2 = item2;
//    }
//
//    public ItemCarrito getItem3() {
//        return item3;
//    }
//
//    public void setItem3(ItemCarrito item3) {
//        this.item3 = item3;
//    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public int length() {
        return items.size();
    }
    public float precio() {
        //cambio la obtención del precio del carrito
        float precioFinal = 0;
        if (this.length()!=0) {

            for (ItemCarrito item: this.items ) {
                float precioItem = item.getPrecioUnitario();
                precioFinal += precioItem ;
            }

        }
        return precioFinal;
    }

    public void setDescuentoFijo(float valor) throws CarritoSinItemsException {
        this.descuentoCarrito = new DescuentoFijo();
        if (this.length()>0) {
            this.descuentoCarrito.setValor(valor);
        } else throw new CarritoSinItemsException(this);




    }

    public void setDescuentoPorcentaje (float valor) throws CarritoSinItemsException {
        this.descuentoCarrito = new DescuentoPorcentaje();
        if (this.length()>0) {
            this.descuentoCarrito.setValor(valor);
        } else throw new CarritoSinItemsException(this);



    }

    public void setDescuentoPorcentajeConTope(float valor, float tope)throws CarritoSinItemsException {
        this.descuentoCarrito = new DescuentoPorcentajeConTope(tope);
        if (this.length()>0) {
            this.descuentoCarrito.setValor(valor);
        } else throw new CarritoSinItemsException(this);

    }

    public String getTipoDescuento() {
        String resultado = "Descuento no asignado";
        if (this.descuentoCarrito != null) {
            if (this.descuentoCarrito instanceof DescuentoFijo) {
                resultado = "Descuento Fijo: " + this.descuentoCarrito.getValor();
            } else if (this.descuentoCarrito instanceof DescuentoPorcentajeConTope) {
                resultado = "Descuento con Porcentaje: " + this.descuentoCarrito.getValor() + " y con el Tope: "+ ((DescuentoPorcentajeConTope)this.descuentoCarrito).getTope() ;
            } else if (this.descuentoCarrito instanceof DescuentoPorcentaje) {
                resultado = "Descuento Porcentaje: " + this.descuentoCarrito.getValor();
            }

        }
        return resultado;
    }

    public float getdescuentoCarrito() {
        return descuentoCarrito.getValor();
    }

    public void eliminarDescuento() {
        this.descuentoCarrito = null;
    }




}
