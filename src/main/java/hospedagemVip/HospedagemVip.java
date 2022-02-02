package hospedagemVip;


public class HospedagemVip extends Hospedagem{

    private Double valorAdicional;

    public HospedagemVip(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public void printValor() {
        System.out.println("Valor HospedagemVIP: " + (this.getValor() + valorAdicional));
    }

}
