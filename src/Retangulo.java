public class Retangulo {

    private double altura;
    private double comprimento;
    private double area;

    public Retangulo(double altura, double comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
        this.area = altura*comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public void setArea(double comprimento, double altura) {
        this.area = comprimento * altura;
    }
    public double getArea() {
        return area;
    }
}
