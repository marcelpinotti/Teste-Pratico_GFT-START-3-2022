package calculoDaArea;

public class Circulo implements AreaCalculavel{

    final private Double pi = 3.14;
    private Double raio;

    public Circulo(Double raio){
        this.raio = raio;
    }

    @Override
    public Double calculoDaArea() {
        Double area = pi * Math.pow(raio, 2);
        return area;
    }
}
