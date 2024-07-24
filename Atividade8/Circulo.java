import javax.swing.JOptionPane;

public class Circulo {
    private double raio;
    private double area;
    private double perimetro;
    private final double PI = 3.14;

    public Circulo() {}

    public Circulo(double raio, double area, double perimetro) {
        this.raio = raio;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void calcularArea(){
        this.area = this.raio * this.raio * this.PI;
        JOptionPane.showMessageDialog(null, "O valor da área: " + String.format("%.2f", this.area), "Área", JOptionPane.INFORMATION_MESSAGE);
    }

    public void calcularPerimetro(){
        this.perimetro = 2 * this.PI * this.raio;
        JOptionPane.showMessageDialog(null, "O valor do perímetro: " + String.format("%.2f", this.perimetro), "Perímetro", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
