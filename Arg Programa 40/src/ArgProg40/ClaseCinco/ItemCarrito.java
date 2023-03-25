package ArgProg40.ClaseCinco;

public class ItemCarrito {
    private int cantidad;
    private Producto itemProducto;
    private float precioUnitario;


    public ItemCarrito() {

    }

    public ItemCarrito(int cantidad, Producto itemProducto) {
        this.setItemProducto(itemProducto);
        this.setCantidad(cantidad);
        //actualicé para que primero asigne el producto y luego haga el set de la cantidad, y allí se calcula el precio unitario
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
