public class Circulo {

    private final double pi = 3.14159265359;
    private double raio;
    private double circunferencia;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
        this.circunferencia = 2 * pi * raio;
        this.area = pi * raio * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
