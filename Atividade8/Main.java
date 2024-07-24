import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setRaio(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio do circulo", JOptionPane.QUESTION_MESSAGE)));

        circulo.calcularArea();
        circulo.calcularPerimetro();
    }
}
