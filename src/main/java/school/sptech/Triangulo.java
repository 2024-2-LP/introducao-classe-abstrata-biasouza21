package school.sptech;

public class Triangulo extends Figura {
    private Double base;
    private Double altura;

    @Override
    public Double calcularArea(){
        Double calculoArea = (base * altura) / 2;
        return calculoArea;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
