package ArgProg40.ClaseCinco;

public class carrito {
    private itemCarrito item1;
    private itemCarrito item2;
    private itemCarrito item3;
    private Persona cliente;
/*    private DescuentoBanco descuentoBanco;
    private DescuentoTienda descuentoTienda;*/

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

/*    public DescuentoBanco getDescuentoBanco() {
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
    }*/


    public float precio() {
        float precio1 = 0;
        float precio2 = 0;
        float precio3 = 0;
        if (item1 != null) precio1 = item1.costoItemCarrito();
        if (item2 != null) precio2 = item2.costoItemCarrito();
        if (item3 != null) precio3 = item3.costoItemCarrito();

        return precio1 + precio2 + precio3;

    }

}
