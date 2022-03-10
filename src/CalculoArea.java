import javax.swing.*;

public class CalculoArea {
    public static void main(String[] args) {

        int op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        switch (op) {
            case 1:
                Retangulo retangulo =
                        new Retangulo(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")),
                                Double.parseDouble(JOptionPane.showInputDialog("Informe a largura: ")));

                JOptionPane.showMessageDialog(null,
                       String.format("===Dados do retângulo/quadrado===%n" +
                                       "Altura: %.2f%n" +
                                       "Comprimento: %.2f%n" +
                                       "Área total: %.2f" +
                                       "", retangulo.getAltura(), retangulo.getComprimento(),
                               retangulo.getArea()));
                break;
            case 2:
                Triangulo triangulo =
                        new Triangulo(Double.parseDouble(JOptionPane.showInputDialog("Informe um lado: ")),
                                Double.parseDouble(JOptionPane.showInputDialog("Informe outro lado: ")),
                                Double.parseDouble(JOptionPane.showInputDialog("Informe outro lado: ")),
                                Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")));
                JOptionPane.showMessageDialog(null,
                        String.format("===Dados do triângulo===%n" +
                                        "Lado 1: %.2f%n" +
                                        "Lado 2: %.2f%n" +
                                        "Lado 3: %.2f%n" +
                                        "Altura: %.2f%n" +
                                        "Área total: %.2f" +
                                        "", triangulo.getLado1(), triangulo.getLado2(),
                                        triangulo.getLado3(), triangulo.getAltura(), triangulo.getArea()));
                break;
            case 3:
                Circulo circulo = new Circulo(Double.parseDouble(JOptionPane.showInputDialog("Informe o raio : ")));
                JOptionPane.showMessageDialog(null,
                        String.format("===Dados do círculo===%n" +
                                        "Raio: %.2f%n" +
                                        "Circunferência: %.2f%n" +
                                        "Área total: %.2f" +
                                        "", circulo.getRaio(), circulo.getCircunferencia(),
                                circulo.getArea()));
                break;
            case 4:
                break;
            case 5:
                break;
        }

    }
    private static Object menu() {
        return (String.format("====Cálculo de área de polígonos====%n" +
                "Selecione a opção desejada:%n" +
                "1) Quadrado/Retângulo%n" +
                "2) Triângulo%n" +
                "3) Círculo%n" +
                "4) Trapézio%n" +
                "5) Sair%n"));
    }
}
