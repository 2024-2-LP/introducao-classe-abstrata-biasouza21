package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaVariaveis = 0.0;
        for (Figura figura : figuras) {
            somaVariaveis += figura.calcularArea();
        }
        return somaVariaveis;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> resultado = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura.calcularArea() > 20) {
                resultado.add(figura);
            }
        }
        return resultado;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();
        for (Figura figura : figuras) {
            if (figura instanceof Quadrado) {
                quadrados.add(figura);
            }
        }
        return quadrados;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public String toString() {
        return "Imagem{" +
                "figuras=" + figuras +
                '}';
    }

}
