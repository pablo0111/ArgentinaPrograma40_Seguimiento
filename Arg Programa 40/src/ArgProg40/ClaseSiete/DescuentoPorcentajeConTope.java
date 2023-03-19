package ArgProg40.ClaseSiete;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {
    private float tope;

    public DescuentoPorcentajeConTope(float tope) {
        this.tope = tope;
    }

    @Override
    public float valorFinal(float valorInicial) {
        if (valorInicial-super.valorFinal(valorInicial)>tope){
            return valorInicial-tope;
        } else return super.valorFinal(valorInicial);
    }

    public float getTope() {
        return tope;
    }

    public void setTope(float tope) {
        this.tope = tope;
    }
}
