package hospedagemVip;

public class Programa {

    public static void main (String [] args){

        Hospedagem hospedagem = new Hospedagem(1000.00);
        Hospedagem hospedagemVip = new HospedagemVip(1000.00, 500.00);

        hospedagem.printValor();
        hospedagemVip.printValor();

    }
}
