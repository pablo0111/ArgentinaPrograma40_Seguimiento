package ArgProg40.ClaseSiete;

public abstract class Descuento {
    private float valor;

    public abstract float valorFinal(float valorInicial) ;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
