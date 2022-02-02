package calculoDaArea;

public class Retangulo implements AreaCalculavel{

    private Double largura;
    private Double altura;

    public Retangulo( Double largura, Double altura){
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double calculoDaArea() {
        Double area = largura * altura;
        return area;
    }
}
