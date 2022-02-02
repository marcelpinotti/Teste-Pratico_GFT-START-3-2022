package hospedagemVip;

public class Hospedagem{

    private Double valor;

    public Hospedagem(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void printValor() {
        System.out.println("Valor Hospedagem: " + this.getValor());
    }
}
