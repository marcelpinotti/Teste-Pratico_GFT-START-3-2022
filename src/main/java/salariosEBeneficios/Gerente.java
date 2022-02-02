package salariosEBeneficios;

public class Gerente extends Funcionarios {

    final private String funcao = "Gerente";

    public Gerente(String nome, Integer idade, Double salario) {
        super(nome, idade, salario);
        super.setFuncao(funcao);
    }

    @Override
    public void bonificacao() {
        Double novoSalário = this.getSalario() + 10000.00;
        this.setSalario(novoSalário);
    }

}
