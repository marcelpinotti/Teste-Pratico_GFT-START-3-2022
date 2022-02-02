package salariosEBeneficios;

public class Principal {

    public static void main (String [] args){

        Funcionarios gerente = new Gerente("Pedro", 38, 8000.00);
        System.out.println(gerente.toString());
        gerente.bonificacao();
        System.out.println(gerente.toString());

        Funcionarios surpevisor = new Supervisor("Márcio", 30, 4500.00);
        System.out.println(surpevisor.toString());
        surpevisor.bonificacao();
        System.out.println(surpevisor.toString());

        Funcionarios vendedor = new Vendedor("Marcel", 39, 2500.00);
        System.out.println(vendedor.toString());
        vendedor.bonificacao();
        System.out.println(vendedor.toString());
    }
}
