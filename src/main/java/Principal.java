
import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;
import figuras.Triangulo;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String opcao = "";
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();
        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura Triangulo "
                    + "\n2 - Area Triangulo "
                    + "\n3 - Leitura Retangulo "
                    + "\n4 - Area Retangulo "
                    + "\n5 - Leitura Quadrado "
                    + "\n6 - Area Quadrado "
                    + "\n7 - Leitura Circulo "
                    + "\n8 - Area Circulo "
                    + "\n9 - Sair");

            switch (opcao) {
                case "1": {
                    triangulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Triangulo"));
                    triangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Triangulo")));
                    triangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Triangulo")));
                    break;
                }
                case "2": {
                    JOptionPane.showMessageDialog(null, "Area Triangulo: " + triangulo.getArea());
                    break;
                }

                case "3": {
                    retangulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Retangulo"));
                    retangulo.setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a Base do Retangulo")));
                    retangulo.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura do Retangulo")));
                    break;
                }
                case "4": {
                    JOptionPane.showMessageDialog(null, "Area Retangulo: " + retangulo.getArea());
                    break;
                }

                case "5": {
                    quadrado.setCor(JOptionPane.showInputDialog("Digite a Cor do Quadrado"));
                    quadrado.setLado(Double.parseDouble(JOptionPane.showInputDialog("Digite o Lado do Quadrado")));
                    break;
                }
                case "6": {
                    JOptionPane.showMessageDialog(null, "Area Quadrado: " + quadrado.getArea());
                    break;
                }

                case "7": {
                    circulo.setCor(JOptionPane.showInputDialog("Digite a Cor do Circulo"));
                    circulo.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio do Circulo")));
                    break;
                }
                case "8": {
                    JOptionPane.showMessageDialog(null, "Area Circulo: " + circulo.getArea());
                    break;
                }
            }
        }
    }
}
