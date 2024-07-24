import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.setLado1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do primero lado", JOptionPane.QUESTION_MESSAGE)));
        retangulo.setLado2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o tamanho do segundo lado", JOptionPane.QUESTION_MESSAGE)));

        retangulo.calcularArea();
        retangulo.calcularPerimetro();
    }
}
