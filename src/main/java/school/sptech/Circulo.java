package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    @Override
    public Double calcularArea(){
        Double calculoArea = (raio * raio) * Math.PI;
        return calculoArea;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
