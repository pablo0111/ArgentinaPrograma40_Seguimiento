package ArgProg40.ClaseCinco;

public class itemCarrito {
    private int cantidad;
    private Producto itemProducto;
    private float precioUnitario;


    public itemCarrito() {

    }

    public itemCarrito(int cantidad, Producto itemProducto) {
        this.cantidad = cantidad;
        this.itemProducto = itemProducto;
        this.precioUnitario = cantidad * this.itemProducto.getPrecio();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;
        this.precioUnitario = cantidad * this.itemProducto.getPrecio();
    }

    public Producto getItemProducto() {
        return itemProducto;
    }

    public void setItemProducto(Producto itemProducto) {
        this.itemProducto = itemProducto;
        this.setCantidad(1); //pongo 1 por defecto
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }


    public float costoItemCarrito() {
        return this.precioUnitario;
    }

    @Override
    public String toString() {
        return "itemCarrito{" +
                "cantidad= " + cantidad +
                ", itemProducto= " + itemProducto.getDescipcion() + " precio: $" + itemProducto.getPrecio() +
                '}';
    }
}
