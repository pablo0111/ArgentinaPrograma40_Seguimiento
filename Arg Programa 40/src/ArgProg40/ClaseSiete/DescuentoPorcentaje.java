package ArgProg40.ClaseSiete;

public class DescuentoPorcentaje extends  Descuento{
    @Override
    public float valorFinal(float valorInicial) {
        return valorInicial- (valorInicial * this.getValor()); //obtengo el porcentaje de descuento y lo resto al valor inicial
    }

    @Override
    public void setValor(float valor) {
        if (valor > 100)  {
            super.setValor(1);
        } else if (valor > 0)  {
            super.setValor(valor/100);
        } else super.setValor(0);

    }
}
