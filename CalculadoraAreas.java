abstract class FormaGeometrica {
    public abstract double calcularArea();
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}

class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class CalculadoraArea {
    public static double calcularAreaTotal(FormaGeometrica[] formas) {
        double areaTotal = 0.0;

        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
        }

        return areaTotal;
    }
}

public class CalculadoraAreas {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[3];
        formas[0] = new Circulo(3.0);
        formas[1] = new Retangulo(8.0, 12.0);
        formas[2] = new Triangulo(12.0, 16.0);

        double areaTotal = CalculadoraArea.calcularAreaTotal(formas);
        System.out.println("Área total das formas: " + areaTotal);
    }
}
