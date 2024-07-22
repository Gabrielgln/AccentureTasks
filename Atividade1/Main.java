import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Central de vendas:");
        System.out.println("Quantos bilhetes foram vendidos na classe A:");
        int classeA = sc.nextInt();
        System.out.println("Quantos bilhetes foram vendidos na classe B:");
        int classeB = sc.nextInt();
        System.out.println("Quantos bilhetes foram vendidos na classe C:");
        int classeC = sc.nextInt();
        double valorTotal = (classeA * Estadio.CLASSE_A) + (classeB * Estadio.CLASSE_B) + (classeC * Estadio.CLASSE_C);
        System.out.println("Renda total: " + valorTotal);
    }
}
