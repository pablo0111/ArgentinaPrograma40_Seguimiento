package ArgProg40.ClaseSiete;

public class DescuentoFijo extends Descuento{

    @Override
    public float valorFinal(float valorInicial) {
        //resto el valor fijo de descuento al valor inicial
        if (valorInicial - this.getValor()>0) {
            return  (valorInicial - this.getValor());
        } else return  0;

    }
}
